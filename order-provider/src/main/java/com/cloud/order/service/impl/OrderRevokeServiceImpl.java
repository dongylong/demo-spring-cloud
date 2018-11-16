package com.cloud.order.service.impl;

import com.cloud.order.mapper.EntityOrderDeliveryMapper;
import com.cloud.order.mapper.EntityOrderRevokeMapper;
import com.cloud.order.service.OrderRevokeService;
import com.framework.bean.response.CommonResponse;
import com.framework.validate.exception.BizLayerException;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.cloud.order.bean.doentity.OrderRevokeDo;
import com.cloud.order.bean.enumerate.OrderErrorCode;
import com.cloud.order.bean.enumerate.OrderRevokeStatusEnum;
import com.cloud.order.bean.enumerate.RevokeLogStatusEnum;
import com.cloud.order.bean.po.EntityOrderRevoke;
import com.cloud.order.bean.request.FindPageByOrderAfterId;
import com.cloud.order.bean.request.OrderRevokeRequest;
import com.cloud.order.bean.request.PageResponse;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * @author dongyl
 * @date 10:45 8/19/18
 * @project demo-spring-cloud
 */
public class OrderRevokeServiceImpl implements OrderRevokeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Autowired
    private EntityOrderRevokeMapper orderRevokeMapper;
    @Autowired
    private EntityOrderDeliveryMapper orderDeliveryMapper;

    @Override
    public PageResponse<EntityOrderRevoke> getOrderAfterSellList(FindPageByOrderAfterId request) {
        PageBounds pageBounds = new PageBounds(request.getPageNo(), request.getPageSize());
        PageList<EntityOrderRevoke> entityOrderRevokes = orderRevokeMapper.selectPagesByOrderAfterId(request.getOrderAfterId(), pageBounds);
        if (entityOrderRevokes != null) {
            return new PageResponse<>(entityOrderRevokes.getPaginator().getTotalCount()
                    , entityOrderRevokes.getPaginator().getTotalPages(), request.getPageNo(), entityOrderRevokes);
        }
        return new PageResponse<>(0, 0, request.getPageNo(), new ArrayList<EntityOrderRevoke>());
    }

    //    @Lock
    public CommonResponse<Map<String, Object>> updateOrderAfter(OrderRevokeRequest revokeRequest) {
        long orderAfterId = revokeRequest.getOrderAfterId();
        OrderRevokeDo orderRevokeDo = orderRevokeMapper.selectByOrderAfterId(orderAfterId);
        if (null == orderRevokeDo) {
            LOGGER.error(("orderRevoke is empty"));
            return CommonResponse.success(null);
        }
        long deliveryId = orderRevokeDo.getOrderDeliveryId();
        if (deliveryId < 1) {
            LOGGER.error(("deliveryId is empty"));
            return CommonResponse.success(null);
        }
        //获取处理结果 根据结果进行相应处理
        RevokeLogStatusEnum returnsLogStatusEnum = revokeRequest.getRevokeLogStatusEnum();


        //登录用户信息
        long operatorId = revokeRequest.getOperatorId();
        String operatorName = revokeRequest.getOperatorName();
        //TODO 状态机
//        MultiOrderEventContext multiOrderEventContext = new MultiOrderEventContext();
//        MultiOrderEventContext multiOrderEventContext2 = new MultiOrderEventContext();
        //处理表id TODO
        //SequenceUtil.create().sequenceNextVal(OrderAfterProcessing.class);
        long orderAfterProcessingId = 0;
        int revokeType = orderRevokeDo.getOrderAfterType();
        switch (revokeType) {
            case 1:
                //撤单
                break;
            case 2:
                //换货
                switch (returnsLogStatusEnum) {
                    case BUSINESS_PASSED_EXCHANGE:
                        //商家同意换货申请
                        /**
                         * 只有商家换货处理中才能进入商家同意换货申请
                         */
                        LOGGER.info("售后——进入商家同意换货申请节点");
                        if (OrderRevokeStatusEnum.BUSINESS_PROCESSING.equals(orderRevokeDo.getOrderAfterStatus())) {
                            //售后状态改为用户换货确认中
                            int result = updateOrderAfterStatus(orderAfterId
                                    , OrderRevokeStatusEnum.BARTER_USER_CONFIRMATION_EXCHANGE.getCode(),
                                    operatorId, 0, 0, null
                                    , null, null);
                            if (result == 0) {
                                LOGGER.error("更新售后状态失败");
                                throw new BizLayerException(OrderErrorCode.DB_UPDATE_FAILURE);
                            }
                        }
                        //TODO
                        //商品订单状态改为用户换货确认中
                        //订单源状态
//                        multiOrderEventContext.setSourceStatus(OrderStatus.SKU__SYSTEM_BUSINESS_EXCHANGE_PROCESSING);
                        //TODO 订单转换事件
//                        multiOrderEventContext.setEvent(OrderStatusChangeEvent.MERCHANT__PASSED_EXCHANGE);
                        break;
                    case BUSINESS_REJECT_EXCHANGE:
                        //商家不同意换货申请（转平台处理）
                        //只有商家换货处理中才能进入商家不同意换货申请（转平台处理）
                        LOGGER.info("售后——进入商家不同意换货申请（转平台处理）节点");
                        if (OrderRevokeStatusEnum.BUSINESS_PROCESSING.equals(orderRevokeDo.getOrderAfterStatus())) {
                            int result = updateOrderAfterStatus(orderAfterId
                                    , OrderRevokeStatusEnum.PLATFORM_PROCESSING.getCode(), operatorId, 0
                                    , 0, null, null, null);
                            if (result == 0) {
                                LOGGER.error("更新售后状态失败");
                                throw new BizLayerException(OrderErrorCode.DB_UPDATE_FAILURE);
                            }
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return null;
    }

    /**
     * 修改售后状态
     *
     * @param orderAfterId
     * @param orderAfterStatus
     * @param operatorId
     * @param orderAfterType
     * @return
     */
    private int updateOrderAfterStatus(long orderAfterId, int orderAfterStatus, long operatorId
            , int orderAfterType, int paymentType, String paymentAccount, BigDecimal paymentMoney
            , String refundFailureReason) {
        EntityOrderRevoke orderRevoke = new EntityOrderRevoke();
        orderRevoke.setOrderAfterId(orderAfterId);
        orderRevoke.setOrderAfterStatus(orderAfterStatus);
        orderRevoke.setOrderAfterType(orderAfterType);
        //赔付类型 赔付账号
        orderRevoke.setPaymentType(paymentType);
        orderRevoke.setPaymentAccount(paymentAccount);
        orderRevoke.setPaymentAmount(paymentMoney);
        if (StringUtils.isNotBlank(refundFailureReason)) {
            orderRevoke.setRefundFailureReason(refundFailureReason);
        }
        orderRevoke.setUpdateTime(new Date());
        orderRevoke.setLastUpdBy(operatorId);
        return orderRevokeMapper.updateOrderRevokeResults(orderRevoke);
    }
}

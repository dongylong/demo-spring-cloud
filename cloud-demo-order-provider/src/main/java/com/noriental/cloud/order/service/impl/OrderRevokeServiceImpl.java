package com.noriental.cloud.order.service.impl;

import com.dongyl.validate.bean.CommonResponse;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.noriental.cloud.order.bean.annotation.Lock;
import com.noriental.cloud.order.bean.po.EntityOrderDelivery;
import com.noriental.cloud.order.bean.po.EntityOrderRevoke;
import com.noriental.cloud.order.bean.request.FindPageByOrderAfterId;
import com.noriental.cloud.order.bean.request.OrderRevokeRequest;
import com.noriental.cloud.order.bean.request.PageResponse;
import com.noriental.cloud.order.mapper.EntityOrderDeliveryMapper;
import com.noriental.cloud.order.mapper.EntityOrderRevokeMapper;
import com.noriental.cloud.order.service.OrderRevokeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
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

    @Lock
    public CommonResponse<Map<String, Object>> updateOrderAfter(OrderRevokeRequest revokeRequest) {
        long orderAfterId = revokeRequest.getOrderAfterId();
        EntityOrderRevoke orderRevoke = orderRevokeMapper.selectByOrderAfterId(orderAfterId);
        if (null == orderRevoke) {
            LOGGER.error(("orderRevoke is empty"));
            return CommonResponse.success(null);
        }
        long deliveryId = orderRevoke.getOrderDeliveryId();
        if (deliveryId < 1) {
            LOGGER.error(("deliveryId is empty"));
            return CommonResponse.success(null);
        }
        EntityOrderDelivery orderDelivery = orderDeliveryMapper.selectById(deliveryId);
        return null;
    }
}

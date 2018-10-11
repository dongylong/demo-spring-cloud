//package com.noriental.cloud.order.service;
//
//import com.foriseland.ec.order.consumer.vo.req.*;
//import com.foriseland.ec.order.consumer.vo.res.*;
//import com.foriseland.ec.order.consumer.vo.res.BuyerUser;
//import com.foriseland.ec.order.consumer.vo.res.CommentGoods;
//import com.foriseland.ec.order.consumer.vo.res.OrderAfterApplyRecordVo;
//import com.foriseland.fjf.rpc.storage.Request;
//import com.foriseland.fjf.rpc.storage.Response;
//import com.github.pagehelper.PageInfo;
//
//import java.util.List;
//
///**
// * 售后相关-Api（退货流程）
// */
//public interface IOrderAfterSellService {
//    /**
//     * 售后申请--发货订单商品列表（适用发货订单商品列表，退款订单商品列表，退款订单评价商品列表）
//     * @param req 订单Id（返货单Id：order_delivery主键Id）
//     * @author chenxiong
//     * */
//    Response<List<OrderProductBasicVo>> queryOrderAfterProducts(Request<String> req);
//
//    /**
//     * 售后-申请列表
//     * @param req 用户Id
//     * @author
//     * */
//    Response<PageInfo<OrderAfterSellListVo>> getOrderAfterSellList(Request<OrderAfterAppliVo> req);
//
//    /**
//     * 售后-申请记录列表(已申请售后列表)
//     * @param req 用户Id
//     * @author
//     * */
//    Response<PageInfo<OrderAfterApplyRecordVo>> getOrderAfterRecordList(Request<OrderAfterAppliVo> req);
//    /**
//     * 售后-申请（下单人信息，适用退款，退货）
//     * @param req addressId买家收货地址ID
//     * @author
//     * */
//    Response<BuyerUser> getUser(Request<String> req);
//    /**
//     * 售后-申请提交接口(退货)
//     * @param
//     * */
//    Response<OrderAfterSellResultVo> addOrderAfterRecord(Request<AddOrderAfterForm> req);
//
//    /**
//     * 售后处理
//     * @param req
//     * @return
//     */
//    Response<String> updateOrderAfter(Request<OrderReturnsUpdateVo> req);
//    /**
//     * 退款失败、先行赔付修改状态接口（财务调用）
//     *
//     * @param req
//     */
//    Response<Boolean> updateOrderStatus(Request<OrderReturnsUpdateVo> req);
//
//    /**
//     * 售后-服务详情
//     * @param orderAfterInfoReq 售后单号
//     * */
//    Response<OrderAfterInfoVo> getOrderAfterInfo(Request<OrderAfterInfoReq> orderAfterInfoReq);
//
//    /**
//     * 售后-进度详情
//     * @param req 售后单号
//     * @return
//     */
//    Response<List<OrderAfterSellLogResVo>> searchByOrderAfterId(Request<OrderAfterSellLogReqVo> req);
//
//    /**
//     * 售后-去评价（只针对退货）
//     * @param req 售后服务Id
//     * */
//    Response<List<CommentGoods>> goComment(Request<String> req);
//    /**
//     * 售后-提交评价
//     * @param
//     * */
//    Response<Integer> addComment(Request<CommentFrom> commentFrom);
//
//    /**
//     *  根据用户Id获取指定用户正在进行中的售后条数（仅退货使用）
//     * @param req 用户Id
//     * */
//    Response<Integer> queryUserOrderAfeterSellCount(Request<String> req);
//
//    /**
//     * 取消售后
//     * @param req
//     * @return
//     */
//    Response<String> cancelAfterSeller(Request<CancelOrderAfterReq> req);
//    /**
//     * 校验是否能取消售后订单
//     * @param req
//     * @return
//     */
//    Response<String> checkCancelAfterSeller(Request<CancelOrderAfterReq> req);
//
//    /**
//     * 冻结商品订单
//     * @param req
//     * @return
//     */
//    Response<String> frozenSkuOrder(Request<List<Long>> req);
//
//    /**
//     * 解冻商品订单
//     * @param req
//     * @return
//     */
//    Response<String> relieveFrozenSkuOrder(Request<List<Long>> req);
//
//    /**
//     * 财务退款接口
//     * @param req
//     * @return
//     */
//    Response<FinancialRefundVo> findFinancialRefundList(Request<FinancialRefundReq> req);
//
//}

package com.noriental.cloud.order.bean.enumerate;

/**
 * @author dongyl
 * @date 11:37 8/19/18
 * @project demo-spring-cloud
 */
public enum OrderRevokeEnum {

    //新售后处理结果常量
    BUSINESS_PASSED_APPLICATIONS(1, "商家同意退货申请,售后状态改为:1 运营审核退单中"),
    BUSINESS_REJECT_APPLICATIONS(2, "商家不同意退货申请"),// 售后状态改为"1"运营审核退单中
    PLATFORM_PASSED_APPLICATIONS(3, "平台同意申请,基于 1 或 2 或  4（三方协商后同意退货申请）"),//校验是否有物流信息 售后状态改为"2","售前退款中/售后退货中"
    PLATFORM_REJECT_APPLICATIONS(4, "平台拒绝申请转给平台做三方协商后做处理 基于 2"),//售后状态不改变 还是"1"运营审核退单中
    PLATFORM_CANCEL_APPLICATIONS(5, "平台发起的取消售后基于 4（三方协商后平台取消售后）或 8（供应商验货不通过后平台强制退货）"),//调用接口（售后状态改为10）
    ADVANCE_PAYMENT(6, "平台先行赔付基于4（三方协商后先行赔付）"),//售后状态改为???
    BUSINESS_PASSED_CHECKING(7, "供应商检验商品通过（商家同意入库）"),//售后状态改为 4 平台处理售后退货中
    BUSINESS_REJECT_CHECKING(8, "供应商货品验收未通过（商家不同意入库）"),//售后状态改为 4 平台处理售后退货中
    PLATFORM_PASSED_CHECKING(9, "平台同意入库基于7  或 8（供应商验货不通过后平台强制退货）"),//售后状态改为 3 退货入库完毕
    PLATFORM_PASSED_REFUND(10, "平台确认退款"),//  如果是orderAftertype为1前置状态必须为2售前退款中，售后状态不变；
    // 如果是orderAftertype为2前置状态必须为3 退货入库完毕，售后状态改为5；
    //然后在porvider调用支付发起退款
    BUYER_RETURN_GOODS(11, ""),//用户将商品寄回
    BUSINESS_APPEND_LOGISTICS_INFORMATION(12, "商家补填物流信息"),
    BUSINESS_PASSED_EXCHANGE(13, "商家同意换货申请"),////售后状态不变（商家换货处理中） 商品订单状态不变（商家换货处理中）
    BUSINESS_REJECT_EXCHANGE(14, "商家不同意换货申请（转平台处理）"),////售后状态改为人工处理换货 商品订单状态改为运营处理换货
    PLATFORM_PASSED_EXCHANGE(15, "平台同意换货申请(强制换货?）"),// //售后状态改为商家换货处理中 商品订单状态改为商家换货处理中
    BUSINESS_CONFIRM_EXCHANGE(16, "商家换货确认（商家确认收到货后）"),///售后状态改为用户换货确认中 商品订单状态改为用户换货确认中
    BUYER_CONFIRM_EXCHANGE(17, "用户换货确认（买家确认收到货后）"),// //售后状态改为换货完成 商品订单状态改为可结算订单解冻? 调用接口
    ADVANCE_PAYMENT_FINISH(21, "先行赔付完成"),//
    ARTIFICIAL_REFUNDS(22, "人工退款");//
    private final int code;
    private final String msg;

    OrderRevokeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

package com.noriental.cloud.order.bean.enumerate;

/**
 * @author dongyl
 * @date 12:01 8/19/18
 * @project demo-spring-cloud
 */
public enum RevokePesLogStatusEnum {

    BUSINESS_PASSED_APPLICATIONS(1, "商家同意退货申请"),
    BUSINESS_REJECT_APPLICATIONS(2, "商家拒绝退货申请"),
    PLATFORM_PASSED_APPLICATIONS(3, "平台同意申请"),
    PLATFORM_REJECT_APPLICATIONS(4, "平台拒绝申请"),
    PLATFORM_CANCEL_APPLICATIONS(5, "平台取消售后"),
    ADVANCE_PAYMENT(6, "平台先行赔付"),
    BUSINESS_PASSED_CHECKING(7, "供应商检验商品通过"),
    BUSINESS_REJECT_CHECKING(8, "供应商货品验收未通过"),
    PLATFORM_PASSED_CHECKING(9, "平台同意入库"),
    PLATFORM_PASSED_REFUND(10, "平台确认退款"),
    BUYER_RETURN_GOODS(11, "用户将商品寄回"),

    REFUND_ING(12, "退款中"),

    BUSINESS_PASSED_EXCHANGE(13, "商家同意换货申请"),
    BUSINESS_REJECT_EXCHANGE(14, "商家不同意换货申请"),
    PLATFORM_PASSED_EXCHANGE(15, "平台同意换货申请"),
    BUSINESS_CONFIRM_EXCHANGE(16, "商家换货确认"),
    BUYER_CONFIRM_EXCHANGE(17, "用户换货确认"),
    REFUND_SUCCESS(18, "退款成功"),
    REFUND_FALSE(19, "退款失败"),

    TRIPARTITE_COORDINATION(20, "三方协调中"),

    SYNC_STATUS(21, "状态同步"),
    ARTIFICIAL_REFUNDS(22, "人工退款"),
    ADVANCE_PAYMENT_REFUNDS(23, "先行赔付退款"),
    ADVANCE_PAYMENT_SUCCESS(24, "先行赔付确认到账");


    private final int code;
    private final String msg;

    RevokePesLogStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getName(Long code) {
        for (RevokePesLogStatusEnum c : RevokePesLogStatusEnum.values()) {
            if (c.getCode()==code) {
                return c.msg;
            }
        }
        return null;
    }
}

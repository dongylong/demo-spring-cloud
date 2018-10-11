package com.cloud.order.bean.enumerate;

/**
 * @author dongyl
 * @date 11:57 8/19/18
 * @project demo-spring-cloud
 */
public enum RevokeLogStatusEnum {
    BUSINESS_PASSED_APPLICATIONS(1, "运营审核退单中"),
    BUSINESS_REJECT_APPLICATIONS(2, "运营审核退单中"),
    PLATFORM_PASSED_APPLICATIONS(3, "平台同意申请"),
    PLATFORM_REJECT_APPLICATIONS(4, "三方协调中"),
    PLATFORM_CANCEL_APPLICATIONS(5, "退单已撤销"),
    ADVANCE_PAYMENT(6, "退款中"),
    BUSINESS_PASSED_CHECKING(7, "平台处理售后退货中"),
    BUSINESS_REJECT_CHECKING(8, "平台处理售后退货中"),
    PLATFORM_PASSED_CHECKING(9, "售后退款中"),
    PLATFORM_PASSED_REFUND(10, "退款中"),
    BUYER_RETURN_GOODS(11, "商家验货中"),

    REFUND_ING(12, "退款中"),

    BUSINESS_PASSED_EXCHANGE(13, "用户确认换货中"),
    BUSINESS_REJECT_EXCHANGE(14, "人工处理换货中"),
    PLATFORM_PASSED_EXCHANGE(15, "商家换货处理中"),
    BUYER_CONFIRM_EXCHANGE(17, "换货完成"),
    REFUND_SUCCESS(18, "退款成功"),
    REFUND_FALSE(19, "退款失败"),

    TRIPARTITE_COORDINATION(20, "三方协调中"),

    ADVANCE_PAYMENT_REFUNDS(21, "先行赔付退款完成"),
    ADVANCE_PAYMENT_SUCCESS(22, "先行赔付确认到账");


    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    RevokeLogStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getName(int code) {
        for (RevokeLogStatusEnum c : RevokeLogStatusEnum.values()) {
            if (c.getCode()==code) {
                return c.msg;
            }
        }
        return null;
    }
}

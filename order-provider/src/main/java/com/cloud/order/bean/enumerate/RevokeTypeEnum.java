package com.cloud.order.bean.enumerate;

/**
 * @author dongyl
 * @date 11:37 8/19/18
 * @project demo-spring-cloud
 */
public enum RevokeTypeEnum {

    //1退货 2 换货 3 人工退款 4 先行赔付
    REVOKE(1, "退货"),
    BARTER(2, "换货"),
    MANUAL_REFUND(3, "人工退款"),
    ADVANCE_PAYMENT(4, "先行赔付");
    private final int code;
    private final String msg;

    RevokeTypeEnum(int code, String msg) {
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

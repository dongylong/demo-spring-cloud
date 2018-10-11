package com.cloud.order.bean.enumerate;

/**
 * @author dongyl
 * @date 11:40 8/19/18
 * @project demo-spring-cloud
 */
public enum OrderRevokeStatusEnum {
    /**
     * 新售后状态
     * 0:商家审核退单中,1:运营审核退单中,2:售后退货中,3:退货入库完毕,4:平台处理售后退货中,5:售后退款中,6:售后退款成功,7:售后退款失败
     * ,8:先行赔付完成,9:先行赔付中,10:退单已撤销,11:三方线下沟通中,12:待用户回填物流信息,13:用户已将商品寄回,14:先行赔付退款确认中
     * ,15:售前退款中,16:售前退款成功,17:售前退款失败,18:商家换货处理中,19:人工处理换货,20:用户确认换货中,21:换货完成
     * (退款:0,1,10,15,16,17
     * 退货:0-14
     * 换货:19:人工处理换货,20:用户确认换货中,21:换货完成))',
     */

    BUSINESS_PROCESSING(0, "商家审核退单中"),
    PLATFORM_PROCESSING(1, "运营审核退单中"),
    RETURNING(2, "售后退货中"),
    RETURN_GOODS_SUCCESS(3, "退货入库完毕"),
    PLATFORM_RETURNING(4, "平台处理售后退货中"),
    RETURN_MONEY_ING(5, "售后退款中"),
    RETURN_MONEY_SUCCESS(6, "售后退款成功"),
    RETURN_MONEY_FALSE(7, "售后退款失败"),
    PRE_PAYMENT_COMPLETION(8, "先行赔付完成"),
    PRE_PAYMENT_COMPLETION_ING(9, "先行赔付中"),
    CANCEL_PROCESSING(10, "退单已撤销"),
    TRIPARTITE_COORDINATION(11, "三方线下沟通中"),
    BACKFILLING_LOGISTICS_FOR_USERS(12, "待用户回填物流信息"),
    USER_HAS_SENT_PRODUCT(13, "用户已将商品寄回"),
    PRE_PAYMENT_RETURNS(14, "先行赔付退款中"),
    REFUNDING(15, "售前退款中"),
    REFUND_SUCCESS(16, "售前退款成功"),
    REFUND_FALSE(17, "售前退款失败"),
    BARTER_REFUND_FALSE(18, "商家换货处理中"),
    BARTER_PLATFORM_PROCESSING(19, "人工处理换货"),
    BARTER_USER_CONFIRMATION_EXCHANGE(20, "用户确认换货中"),
    BARTER_EXCHANGE_SUCCESS(21, "换货完成");

    private final int code;
    private final String msg;

    OrderRevokeStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    //    public static String getName(String code) {
//        for (AfterSaleStatus c : AfterSaleStatus.values()) {
//            if (c.getCode().equals(code)) {
//                return c.name;
//            }
//        }
//        return null;
//    }
}

package com.cloud.order.bean.request;

/**
 * @author dongyl
 * @date 20:33 8/19/18
 * @project demo-spring-cloud
 */
public class FindPageByOrderAfterId extends PageBaseRequest {
    private Long orderAfterId;

    public Long getOrderAfterId() {
        return orderAfterId;
    }

    public void setOrderAfterId(Long orderAfterId) {
        this.orderAfterId = orderAfterId;
    }
}

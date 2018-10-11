package com.cloud.order.service;

import com.cloud.order.bean.po.EntityOrderPurchase;

/**
 * @author dongyl
 * @date 20:38 8/18/18
 * @project demo-spring-cloud
 */
public interface OrderSplitService {
    public void insertIntoPayment(EntityOrderPurchase orderPayment);
}

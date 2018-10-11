package com.cloud.order.service.impl;

import com.cloud.order.mapper.EntityOrderPurchaseMapper;
import com.cloud.order.service.OrderSplitService;
import com.cloud.order.bean.po.EntityOrderPurchase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dongyl
 * @date 20:38 8/18/18
 * @project demo-spring-cloud
 */
public class OrderSplitServiceImpl implements OrderSplitService {
    @Autowired
    private EntityOrderPurchaseMapper orderPaymentMapper;
    @Override
    public void insertIntoPayment(EntityOrderPurchase orderPayment) {
        orderPaymentMapper.insert(orderPayment);
    }
}

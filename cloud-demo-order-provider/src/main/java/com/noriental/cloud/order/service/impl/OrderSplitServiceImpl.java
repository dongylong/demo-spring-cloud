package com.noriental.cloud.order.service.impl;

import com.noriental.cloud.order.bean.po.EntityOrderPurchase;
import com.noriental.cloud.order.mapper.EntityOrderPurchaseMapper;
import com.noriental.cloud.order.service.OrderSplitService;
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

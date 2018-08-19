package com.noriental.cloud.order.mapper;

import com.noriental.cloud.order.bean.po.EntityOrderPayment;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityOrderPaymentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EntityOrderPayment record);

    EntityOrderPayment selectByPrimaryKey(Long id);

    int updateByPrimaryKey(EntityOrderPayment record);
}
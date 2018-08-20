package com.noriental.cloud.order.mapper;

import com.noriental.cloud.order.bean.po.EntityOrderPurchase;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityOrderPurchaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EntityOrderPurchase record);

    EntityOrderPurchase selectByPrimaryKey(Long id);

    int updateByPrimaryKey(EntityOrderPurchase record);
}
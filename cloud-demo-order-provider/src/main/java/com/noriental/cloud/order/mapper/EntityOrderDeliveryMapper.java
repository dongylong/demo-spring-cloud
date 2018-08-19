package com.noriental.cloud.order.mapper;

import com.noriental.cloud.order.bean.po.EntityOrderDelivery;
import org.springframework.stereotype.Repository;

/**
 * @author dongyl
 * @date 18:06 8/19/18
 * @project demo-spring-cloud
 */
@Repository
public interface EntityOrderDeliveryMapper {
    public EntityOrderDelivery selectById(long deliveryId);
}

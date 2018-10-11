package com.cloud.order.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.cloud.order.bean.doentity.OrderRevokeDo;
import com.cloud.order.bean.po.EntityOrderRevoke;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author dongyl
 */
@Repository
public interface EntityOrderRevokeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EntityOrderRevoke record);


    EntityOrderRevoke selectByPrimaryKey(Long id);

    int updateByPrimaryKey(EntityOrderRevoke record);
    OrderRevokeDo selectByOrderAfterId(@Param("orderAfterId")long orderAfterId);
    PageList<EntityOrderRevoke> selectPagesByOrderAfterId(@Param("orderAfterId")long orderAfterId, PageBounds pageBounds);

    int updateOrderRevokeResults(EntityOrderRevoke orderRevoke);
}
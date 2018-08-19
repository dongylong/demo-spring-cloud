package com.noriental.cloud.order.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.noriental.cloud.order.bean.po.EntityOrderRevoke;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dongyl
 */
@Repository
public interface EntityOrderRevokeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EntityOrderRevoke record);


    EntityOrderRevoke selectByPrimaryKey(Long id);

    int updateByPrimaryKey(EntityOrderRevoke record);
    EntityOrderRevoke selectByOrderAfterId(@Param("orderAfterId")long orderAfterId);
    PageList<EntityOrderRevoke> selectPagesByOrderAfterId(@Param("orderAfterId")long orderAfterId, PageBounds pageBounds);

}
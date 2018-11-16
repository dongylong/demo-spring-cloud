package com.cloud.usersvr.mapper;

import com.cloud.usersvr.bean.User;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author dongyl
 * @date 14:32 11/16/18
 * @project demo-spring-cloud
 */
@Repository
public interface UserMapper {
    PageList<User> findUploadList(PageBounds pageBounds);

}

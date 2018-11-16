package com.cloud.usersvr.service.impl;

import com.framework.bean.request.PageBaseRequest;
import com.cloud.usersvr.bean.User;
import com.framework.bean.response.PageResponse;
import com.cloud.usersvr.mapper.UserMapper;
import com.cloud.usersvr.service.UserService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * @author dongyl
 * @date 14:30 11/16/18
 * @project demo-spring-cloud
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageResponse<User> findUploadList(PageBaseRequest request) {
        PageBounds pageBounds = new PageBounds(request.getPageNo(), request.getPageSize());
        PageList<User> uploadRecordVos = userMapper.findUploadList(pageBounds);
        if (uploadRecordVos != null) {
            return new PageResponse<>(uploadRecordVos.getPaginator().getTotalCount(), uploadRecordVos.getPaginator().getTotalPages(), request.getPageNo(), uploadRecordVos);
        }
        return new PageResponse<>(0, 0, request.getPageNo(), new ArrayList<User>());
    }
}

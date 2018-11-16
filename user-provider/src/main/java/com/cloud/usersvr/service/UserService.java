package com.cloud.usersvr.service;

import com.framework.bean.request.PageBaseRequest;
import com.cloud.usersvr.bean.User;
import com.framework.bean.response.PageResponse;

/**
 * @author dongyl
 * @date 14:26 11/16/18
 * @project demo-spring-cloud
 */
public interface UserService {
    PageResponse<User> findUploadList(PageBaseRequest request);

}

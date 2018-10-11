package com.cloud.order.service;

import com.cloud.order.bean.po.EntityOrderRevoke;
import com.cloud.order.bean.request.FindPageByOrderAfterId;
import com.cloud.order.bean.request.PageResponse;

/**
 * @author dongyl
 * @date 10:45 8/19/18
 * @project demo-spring-cloud
 */
public interface OrderRevokeService {
    PageResponse<EntityOrderRevoke> getOrderAfterSellList(FindPageByOrderAfterId req);

}

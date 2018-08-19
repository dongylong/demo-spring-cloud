package com.noriental.cloud.order.bean.request;


import com.dongyl.validate.bean.BaseRequest;
import com.noriental.cloud.order.bean.constraints.Pageable;

/**
 * @author chenlihua
 * @date 2016/6/17
 * @time 18:42
 */
@Pageable
public class PageBaseRequest extends BaseRequest {
    private int pageNo = 1;
    private int pageSize = 10;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

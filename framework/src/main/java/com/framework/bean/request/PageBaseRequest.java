package com.framework.bean.request;

/**
 * @author dongyl
 * @date 14:22 11/16/18
 * @project demo-spring-cloud
 */

public class PageBaseRequest {
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

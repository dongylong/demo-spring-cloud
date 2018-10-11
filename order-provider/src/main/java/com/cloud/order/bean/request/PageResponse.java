package com.cloud.order.bean.request;

import com.dongyl.validate.bean.CommonDes;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;

import java.util.List;

/**
 * @author dongyl
 * @date 11:37 8/19/18
 * @project demo-spring-cloud
 */
public class PageResponse<T> extends CommonDes {
    private int totalCount;
    private int totalPageCount;
    private int currentPage;
    private List<T> list;

    public PageResponse() {
    }

    public PageResponse(int totalCount, int totalPageCount, int currentPage, List<T> list) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPageCount = totalPageCount;
        this.list = list;
    }

    public PageResponse(Paginator paginator, List<T> list) {
        if (paginator != null) {
            this.totalCount = paginator.getTotalCount();
            this.totalPageCount = paginator.getTotalPages();
            this.currentPage = paginator.getPage();
            this.list = list;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }


    public List<T> getList() {
        return list;
    }

}

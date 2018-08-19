package com.noriental.cloud.order.bean.po;

import java.util.Date;

/**
 * @author dongyl
 * @date 21:59 8/14/18
 * @project order-svr
 */
public class EntityShareInfo {

    /**
     * 主键ID
     */
    private long id;

    //物流详情表里的sku商品会对应此字段
    private  long skuId = 0;

    /**
     * 下单人
     */
    private long createBy;

    /**
     * 哪里购买的 (圈子ID or 微店ID NULL 代表 平台)
     */
    private long platForm;

    /**
     * 分享人
     */
    private long shareBy;

    /**
     * 店铺ID (NULL:平台、 NOT NULL：店铺ID)
     */
    private long shopId;

    /**
     * 存储类型 g：购物车数据 d：订单数据
     */
    private String sourceType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 分享来源类型(1代表圈子，2代表微店，0代表平台)
     */
    private Integer platFormType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    public long getPlatForm() {
        return platForm;
    }

    public void setPlatForm(long platForm) {
        this.platForm = platForm;
    }

    public long getShareBy() {
        return shareBy;
    }

    public void setShareBy(long shareBy) {
        this.shareBy = shareBy;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPlatFormType() {
        return platFormType;
    }

    public void setPlatFormType(Integer platFormType) {
        this.platFormType = platFormType;
    }
}

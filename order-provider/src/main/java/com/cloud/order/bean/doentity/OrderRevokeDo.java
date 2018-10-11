package com.cloud.order.bean.doentity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dongyl
 * @date 21:48 8/19/18
 * @project demo-spring-cloud
 */
public class OrderRevokeDo {
    private long id;

    private long orderDeliveryId;

    private long orderDeliveryCode;

    private String productCode;

    private long productId;

    private String productName;

    private String productPicUrl;

    private long skuId;

    private String skuCode;

    private String skuName;

    private int count;

    private Date createTime;

    private long createBy;

    private String consigneeName;

    private String consigneeMobile;

    private Date updateTime;

    private long lastUpdBy;

    private long orderAfterId;

    private int orderAfterType;

    private BigDecimal orderAfterAmount;

    private int businessResults;

    private String remarks;

    private Integer forumResults;

    private int orderAfterStatus;

    private int rufundCause;

    private String rufundRemark;

    private int orderAfterStar;

    private String orderAfterEvaluate;

    private String userTel;

    private String userName;

    private BigDecimal freightAmount;

    private BigDecimal favBean;

    private String expressCompany;

    private String expressNum;

    private long refundSerialNumber;

    private String refundFailureReason;

    private long supplierId;

    private String supplierName;

    private int isWhole;

    private int paymentType;

    private BigDecimal paymentAmount;

    private String paymentAccount;

    private String refundSn;

    private long activeGroupId;
    private int activityType;
    private long paymentOrderId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderDeliveryId() {
        return orderDeliveryId;
    }

    public void setOrderDeliveryId(long orderDeliveryId) {
        this.orderDeliveryId = orderDeliveryId;
    }

    public long getOrderDeliveryCode() {
        return orderDeliveryCode;
    }

    public void setOrderDeliveryCode(long orderDeliveryCode) {
        this.orderDeliveryCode = orderDeliveryCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(long lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    public long getOrderAfterId() {
        return orderAfterId;
    }

    public void setOrderAfterId(long orderAfterId) {
        this.orderAfterId = orderAfterId;
    }

    public int getOrderAfterType() {
        return orderAfterType;
    }

    public void setOrderAfterType(int orderAfterType) {
        this.orderAfterType = orderAfterType;
    }

    public BigDecimal getOrderAfterAmount() {
        return orderAfterAmount;
    }

    public void setOrderAfterAmount(BigDecimal orderAfterAmount) {
        this.orderAfterAmount = orderAfterAmount;
    }

    public int getBusinessResults() {
        return businessResults;
    }

    public void setBusinessResults(int businessResults) {
        this.businessResults = businessResults;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getForumResults() {
        return forumResults;
    }

    public void setForumResults(Integer forumResults) {
        this.forumResults = forumResults;
    }

    public int getOrderAfterStatus() {
        return orderAfterStatus;
    }

    public void setOrderAfterStatus(int orderAfterStatus) {
        this.orderAfterStatus = orderAfterStatus;
    }

    public int getRufundCause() {
        return rufundCause;
    }

    public void setRufundCause(int rufundCause) {
        this.rufundCause = rufundCause;
    }

    public String getRufundRemark() {
        return rufundRemark;
    }

    public void setRufundRemark(String rufundRemark) {
        this.rufundRemark = rufundRemark;
    }

    public int getOrderAfterStar() {
        return orderAfterStar;
    }

    public void setOrderAfterStar(int orderAfterStar) {
        this.orderAfterStar = orderAfterStar;
    }

    public String getOrderAfterEvaluate() {
        return orderAfterEvaluate;
    }

    public void setOrderAfterEvaluate(String orderAfterEvaluate) {
        this.orderAfterEvaluate = orderAfterEvaluate;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getFavBean() {
        return favBean;
    }

    public void setFavBean(BigDecimal favBean) {
        this.favBean = favBean;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum;
    }

    public long getRefundSerialNumber() {
        return refundSerialNumber;
    }

    public void setRefundSerialNumber(long refundSerialNumber) {
        this.refundSerialNumber = refundSerialNumber;
    }

    public String getRefundFailureReason() {
        return refundFailureReason;
    }

    public void setRefundFailureReason(String refundFailureReason) {
        this.refundFailureReason = refundFailureReason;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getIsWhole() {
        return isWhole;
    }

    public void setIsWhole(int isWhole) {
        this.isWhole = isWhole;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public long getActiveGroupId() {
        return activeGroupId;
    }

    public void setActiveGroupId(long activeGroupId) {
        this.activeGroupId = activeGroupId;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public long getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(long paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }
}

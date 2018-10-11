package com.cloud.order.bean.vo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderRevokeVo {
    private Long id;

    private Long orderDeliveryId;

    private Long orderDeliveryCode;

    private String productCode;

    private Long productId;

    private String productName;

    private String productPicUrl;

    private Long skuId;

    private String skuCode;

    private String skuName;

    private Integer count;

    private Date createTime;

    private Long createBy;

    private String consigneeName;

    private String consigneeMobile;

    private Date updateTime;

    private Long lastUpdBy;

    private Long orderAfterId;

    private Boolean orderAfterType;

    private BigDecimal orderAfterAmount;

    private Boolean businessResults;

    private String remarks;

    private Integer forumResults;

    private Byte orderAfterStatus;

    private Byte rufundCause;

    private String rufundRemark;

    private Integer orderAfterStar;

    private String orderAfterEvaluate;

    private String userTel;

    private String userName;

    private BigDecimal freightAmount;

    private BigDecimal favBean;

    private String expressCompany;

    private String expressNum;

    private Long refundSerialNumber;

    private String refundFailureReason;

    private Long supplierId;

    private String supplierName;

    private Boolean isWhole;

    private Byte paymentType;

    private BigDecimal paymentAmount;

    private String paymentAccount;

    private String refundSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderDeliveryId() {
        return orderDeliveryId;
    }

    public void setOrderDeliveryId(Long orderDeliveryId) {
        this.orderDeliveryId = orderDeliveryId;
    }

    public Long getOrderDeliveryCode() {
        return orderDeliveryCode;
    }

    public void setOrderDeliveryCode(Long orderDeliveryCode) {
        this.orderDeliveryCode = orderDeliveryCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public Boolean getWhole() {
        return isWhole;
    }

    public void setWhole(Boolean whole) {
        isWhole = whole;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(Long lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    public Long getOrderAfterId() {
        return orderAfterId;
    }

    public void setOrderAfterId(Long orderAfterId) {
        this.orderAfterId = orderAfterId;
    }

    public Boolean getOrderAfterType() {
        return orderAfterType;
    }

    public void setOrderAfterType(Boolean orderAfterType) {
        this.orderAfterType = orderAfterType;
    }

    public BigDecimal getOrderAfterAmount() {
        return orderAfterAmount;
    }

    public void setOrderAfterAmount(BigDecimal orderAfterAmount) {
        this.orderAfterAmount = orderAfterAmount;
    }

    public Boolean getBusinessResults() {
        return businessResults;
    }

    public void setBusinessResults(Boolean businessResults) {
        this.businessResults = businessResults;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getForumResults() {
        return forumResults;
    }

    public void setForumResults(Integer forumResults) {
        this.forumResults = forumResults;
    }

    public Byte getOrderAfterStatus() {
        return orderAfterStatus;
    }

    public void setOrderAfterStatus(Byte orderAfterStatus) {
        this.orderAfterStatus = orderAfterStatus;
    }

    public Byte getRufundCause() {
        return rufundCause;
    }

    public void setRufundCause(Byte rufundCause) {
        this.rufundCause = rufundCause;
    }

    public String getRufundRemark() {
        return rufundRemark;
    }

    public void setRufundRemark(String rufundRemark) {
        this.rufundRemark = rufundRemark == null ? null : rufundRemark.trim();
    }

    public Integer getOrderAfterStar() {
        return orderAfterStar;
    }

    public void setOrderAfterStar(Integer orderAfterStar) {
        this.orderAfterStar = orderAfterStar;
    }

    public String getOrderAfterEvaluate() {
        return orderAfterEvaluate;
    }

    public void setOrderAfterEvaluate(String orderAfterEvaluate) {
        this.orderAfterEvaluate = orderAfterEvaluate == null ? null : orderAfterEvaluate.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum == null ? null : expressNum.trim();
    }

    public Long getRefundSerialNumber() {
        return refundSerialNumber;
    }

    public void setRefundSerialNumber(Long refundSerialNumber) {
        this.refundSerialNumber = refundSerialNumber;
    }

    public String getRefundFailureReason() {
        return refundFailureReason;
    }

    public void setRefundFailureReason(String refundFailureReason) {
        this.refundFailureReason = refundFailureReason == null ? null : refundFailureReason.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Boolean getIsWhole() {
        return isWhole;
    }

    public void setIsWhole(Boolean isWhole) {
        this.isWhole = isWhole;
    }

    public Byte getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Byte paymentType) {
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
        this.paymentAccount = paymentAccount == null ? null : paymentAccount.trim();
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn == null ? null : refundSn.trim();
    }
}
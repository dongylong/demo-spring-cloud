package com.noriental.cloud.order.bean.po;

import java.util.Date;

/**
 * @author dongyl
 * @date 09:10 8/17/18
 * @project order-svr
 */
public class EntityOrderPayment {
    private long id;

    //订单编号
    private long orderCode = 0;

    //订单状态: 0：待付款，1，拼团中，2.申请退款中，3.待商家确认，4.拣配中，5.已发货，6.派送中，7.已签收，8.送货失败，9.已完成，10已取消,11.拼团失败,12.已支付；13：支付失败，14：特权分发成功，15特权分发失败\r\n，16退款取消
    private int orderStatus = 0;

    //订单支付编号（引擎使用，拆单前一笔订单为同一个）
    private String orderPayCode = "";

    //买家姓名 ： c端用户中文名字
    private String buyerName = "";

    //支付类型: 支付宝：ALIPAY ，微信：WEIXIN， 盈豆：BEANS，组合：GROUPPAY，汇付宝：HEEPAY，快捷支付：FAST，0元支付：ZERO
    private String payType = "";

    //支付备注
    private String payRemark = "";

    //商品运费 规则：与产品待定
    private double transportMoney = 0.0000;

    //盈豆 ：次支付单所使用了的盈豆总数
    private double favorBeans = 0.0000;

    //优惠金额
    private double discountPrice = 0.0000;

    //应付款
    private double dueMoney = 0.0000;

    //创建时间
    private Date createTime;

    //创建人id
    private long createBy = 0;

    //最后更新时间
    private Date updateTime;

    //最后更新人
    private long updateBy;

    //支付完成时间
    private Date payTime;

    //失效时间（跑批用）
    private Date invalidTime;

    //取消时间
    private Date cancelTime;

    //完成时间
    private Date completeTime;

    //买家收货地址ID
    private long addressId;

    //支付单号：指的是 订单支付完成后又支付服务返回的支付编号。
    private long payOrderCode;

    //是否删除：0否，1是
    private int isDelete;

    //客服态
    private long customerStatus;

    //供应商id
    private long supplierCode = 0;

    //供应商名称
    private String supplierName;

    //商家类型：1.自营；2.POP
    private int supplierType = 0;

    //发票类型：1：发票类型是电子，发票抬头是个人。2：发票类型是电子，发票抬头是单位。3：专用发票
    private int invoiceType;

    //活动类型: 0:普通订单，2: 0元购，4：自己拼，5：每人拼，6：爆款，7：团购，8：拼主拼（多人拼），9：秒杀，10：拼到底
    private int activityType;

    //活动编号：指的是活动单的编号，用作订单与活动对应关系
    private String activityCode;

    // 订单类型 :0：国内，1：海淘,2:特权订单
    private int orderType;

    //返还盈豆额：用作每人拼、拼到底、和活动失败后给参与者返还盈豆额
    private double refundFbeans;

    //下单人/参拼人手机
    private String createPhone;

    //特权接收人信息
    private String privilegeRecipient;

    //支付价格：指的是订单支付时的 最终价格
    private double payPrice;

    //活动团id
    private long activeGroupId;

    //订单业务类型：1-普通实物订单、2-卡券订单、3-攻略订单、4-娃娃机订单、5-海外直邮订单、6-保税仓订单
    private int orderBusinessType = 1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(long orderCode) {
        this.orderCode = orderCode;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPayCode() {
        return orderPayCode;
    }

    public void setOrderPayCode(String orderPayCode) {
        this.orderPayCode = orderPayCode;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public double getTransportMoney() {
        return transportMoney;
    }

    public void setTransportMoney(double transportMoney) {
        this.transportMoney = transportMoney;
    }

    public double getFavorBeans() {
        return favorBeans;
    }

    public void setFavorBeans(double favorBeans) {
        this.favorBeans = favorBeans;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public double getDueMoney() {
        return dueMoney;
    }

    public void setDueMoney(double dueMoney) {
        this.dueMoney = dueMoney;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getPayOrderCode() {
        return payOrderCode;
    }

    public void setPayOrderCode(long payOrderCode) {
        this.payOrderCode = payOrderCode;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public long getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(long customerStatus) {
        this.customerStatus = customerStatus;
    }

    public long getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(long supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(int supplierType) {
        this.supplierType = supplierType;
    }

    public int getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public double getRefundFbeans() {
        return refundFbeans;
    }

    public void setRefundFbeans(double refundFbeans) {
        this.refundFbeans = refundFbeans;
    }

    public String getCreatePhone() {
        return createPhone;
    }

    public void setCreatePhone(String createPhone) {
        this.createPhone = createPhone;
    }

    public String getPrivilegeRecipient() {
        return privilegeRecipient;
    }

    public void setPrivilegeRecipient(String privilegeRecipient) {
        this.privilegeRecipient = privilegeRecipient;
    }

    public double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(double payPrice) {
        this.payPrice = payPrice;
    }

    public long getActiveGroupId() {
        return activeGroupId;
    }

    public void setActiveGroupId(long activeGroupId) {
        this.activeGroupId = activeGroupId;
    }

    public int getOrderBusinessType() {
        return orderBusinessType;
    }

    public void setOrderBusinessType(int orderBusinessType) {
        this.orderBusinessType = orderBusinessType;
    }
}
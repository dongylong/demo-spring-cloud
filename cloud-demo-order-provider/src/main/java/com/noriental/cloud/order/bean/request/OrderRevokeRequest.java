package com.noriental.cloud.order.bean.request;

import com.dongyl.validate.bean.BaseRequest;
import com.noriental.cloud.order.bean.enumerate.RevokeTypeEnum;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author dongyl
 * @date 12:12 8/19/18
 * @project demo-spring-cloud
 */
public class OrderRevokeRequest extends BaseRequest {
    //售后订单code(必传)
    @Min(1)
    private Long orderAfterId;
    //操作人姓名，当前执行动作的人 (必传，当操作人是系统时，为"系统操作")
    @NotNull
    private String operatorName;
    //操作人Id，当前执行动作的人 (必传，当操作人是系统时，为-1)
    @Min(1)
    private Long operatorId;
    /**
     * 1;//商家同意退货申请 2;//商家不同意退货申请 3;//平台同意申请 4;//平台拒绝申请 5;//平台发起的取消售后
     * 6;//平台先行赔付 7;//供应商检验商品通过 8;//供应商货品验收未通过 9;//平台同意入库 10;//平台确认退款 11;//用户将商品寄回  12;//商家补填物流信息
     * 13;//商家同意换货申请 14;//商家不同意换货申请（转平台处理） 15;//平台同意换货申请（强制换货?） 16;//商家换货确认（商家确认收到货后） 17;//用户换货确认（买家确认收到货后）
     * 21 先行赔付完成 22 人工退款 23 同步状态
     */
    @NotNull
    private String returnsLogStatus;
    //平台同意来源（returnsLogStatus是3平台同意申请时必传) 1：商家同意后平台同意， 2：商家不同意后平台同意 3：三方协调后平台同意
    private String plateformPassForm;
    private String plateformCancelForm;//平台取消售后来源（returnsLogStatus是5 平台发起的取消售后) 1：三方协商后取消， 2：平台验货后取消
    private String remarks;//备注
    /**
     * 售后类型 1退货 2换货 3 人工退款 4 先行赔付
     */
    private RevokeTypeEnum revokeTypeEnum;
    private String logisticsComName;//快递公司（仅消费者提交快递凭证和商家补填物流信息时的时候使用）
    private String logisticsComCode;//快递公司编码（仅商家补填物流信息时候使用）
    private String logisticsId;//快递单号（仅消费者提交快递凭证和商家补填物流信息时的时候使用）

    private String operationType;//上传凭证方
    private String actionType;//上传凭证类型

    private String certificateUrl;//凭证
    //是否已签收 当处理处理结果是1;//商家同意退货申请时 填写 0 未签收 1 已签收
    private String isSign;
    private String paymentType;//先行赔付付款类型
    private String paymentAccount;//'付款账号
    private String paymentMoney;//'赔付金额
    /**
     * （0为其他，1为平台(运营后台)，2为商家（供应商后台），3为验货方（供应商验货，或者平台验货））(必传)
     */
    @NotNull
    private Integer ruleType;

    public Long getOrderAfterId() {
        return orderAfterId;
    }

    public void setOrderAfterId(Long orderAfterId) {
        this.orderAfterId = orderAfterId;
    }

    @NotNull
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(@NotNull String operatorName) {
        this.operatorName = operatorName;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    @NotNull
    public String getReturnsLogStatus() {
        return returnsLogStatus;
    }

    public void setReturnsLogStatus(@NotNull String returnsLogStatus) {
        this.returnsLogStatus = returnsLogStatus;
    }

    public String getPlateformPassForm() {
        return plateformPassForm;
    }

    public void setPlateformPassForm(String plateformPassForm) {
        this.plateformPassForm = plateformPassForm;
    }

    public String getPlateformCancelForm() {
        return plateformCancelForm;
    }

    public void setPlateformCancelForm(String plateformCancelForm) {
        this.plateformCancelForm = plateformCancelForm;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public RevokeTypeEnum getRevokeTypeEnum() {
        return revokeTypeEnum;
    }

    public void setRevokeTypeEnum(RevokeTypeEnum revokeTypeEnum) {
        this.revokeTypeEnum = revokeTypeEnum;
    }

    public String getLogisticsComName() {
        return logisticsComName;
    }

    public void setLogisticsComName(String logisticsComName) {
        this.logisticsComName = logisticsComName;
    }

    public String getLogisticsComCode() {
        return logisticsComCode;
    }

    public void setLogisticsComCode(String logisticsComCode) {
        this.logisticsComCode = logisticsComCode;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getCertificateUrl() {
        return certificateUrl;
    }

    public void setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    @NotNull
    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(@NotNull Integer ruleType) {
        this.ruleType = ruleType;
    }
}

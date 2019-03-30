package com.cloud.order.bean.request;

import lombok.Data;

/**
 * @author dongyl
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @created 2019-03-30 18:04
 * @changeRecord
 */
@Data
public class CreateMsgRequest {
    private int orderType;
    private int userType;
    private int orderId;

}

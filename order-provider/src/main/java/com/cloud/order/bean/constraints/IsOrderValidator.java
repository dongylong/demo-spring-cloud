package com.cloud.order.bean.constraints;


import com.cloud.order.bean.request.CreateMsgRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author dongyl
 * @date 11:37 8/19/18
 * @project demo-spring-cloud
 */
public class IsOrderValidator implements ConstraintValidator<IsOrder, CreateMsgRequest> {
    @Override
    public void initialize(IsOrder constraintAnnotation) {
    }

    @Override
    public boolean isValid(CreateMsgRequest value, ConstraintValidatorContext context) {
        if (value.getUserType() == 0) {
            if (value.getOrderType() < 1) {
                return false;
            }
            if (value.getOrderType() != 2 && value.getOrderType() != 4) {
                return false;
            }
        }
        return true;
    }
}

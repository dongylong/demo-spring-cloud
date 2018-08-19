package com.noriental.cloud.order.bean.constraints;

import com.noriental.cloud.order.bean.request.PageBaseRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author dongyl
 * @date 11:37 8/19/18
 * @project demo-spring-cloud
 */
public class PageableValidator implements ConstraintValidator<Pageable, PageBaseRequest> {
    @Override
    public void initialize(Pageable constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(PageBaseRequest value, ConstraintValidatorContext context) {
        if (value.getPageNo() < 1) {
            return false;
        }
        if (value.getPageSize() < 1) {
            return false;
        }
        return true;
    }
}

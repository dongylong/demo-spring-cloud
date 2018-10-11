//package com.noriental.cloud.order.bean.constraints;
//
//
//import com.alibaba.dubbo.common.utils.StringUtils;
//import com.noriental.cloud.order.bean.request.OrderRevokeRequest;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
///**
// * @author dongyl
// * @date 11:37 8/19/18
// * @project demo-spring-cloud
// */
//public class DirectorCodeValidator implements ConstraintValidator<DirectorCode, OrderRevokeRequest> {
//    @Override
//    public void initialize(DirectorCode constraintAnnotation) {
//    }
//
//    @Override
//    public boolean isValid(OrderRevokeRequest value, ConstraintValidatorContext context) {
//        int userType = value.getRuleType();
//        switch (userType) {
//            case 1:
//                if (StringUtils.isBlank(value.getAreaCode())) {
//                    return false;
//                }
//            case 2:
//                if (StringUtils.isBlank(value.getCityCode())) {
//                    return false;
//                }
//            case 3:
//                if (StringUtils.isBlank(value.getProvinceCode())) {
//                    return false;
//                }
//        }
//        return true;
//    }
//}

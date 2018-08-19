//package com.noriental.cloud.order.bean.constraints;
//
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
///**
// * @author dongyl
// * @date 11:37 8/19/18
// * @project demo-spring-cloud
// */
//public class IsOrgValidator implements ConstraintValidator<IsOrg, CreateMsgRequest> {
//    @Override
//    public void initialize(IsOrg constraintAnnotation) {
//    }
//
//    @Override
//    public boolean isValid(CreateMsgRequest value, ConstraintValidatorContext context) {
//        if (value.getUserType() == 0) {
//            if (value.getOrgId() < 1) {
//                return false;
//            }
//            if (value.getOrgType() != 2 && value.getOrgType() != 4) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

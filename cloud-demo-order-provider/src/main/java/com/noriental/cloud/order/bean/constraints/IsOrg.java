//package com.noriental.cloud.order.bean.constraints;
//
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.ElementType.TYPE;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//
///**
// * @author dongyl
// * @date 11:37 8/19/18
// * @project demo-spring-cloud
// */
//@Target({TYPE})
//@Retention(RUNTIME)
//@Documented
//@Constraint(validatedBy = {IsOrgValidator.class})
//public @interface IsOrg {
//    String message() default " 创建用户为学校管理员时，orgId和orgType必填，并且orgType只能为2或4 ";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}

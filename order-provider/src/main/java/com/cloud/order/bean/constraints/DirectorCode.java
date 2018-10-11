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
///**
// * @author dongyl
// * @date 11:37 8/19/18
// * @project demo-spring-cloud
// */
//@Target({TYPE})
//@Retention(RUNTIME)
//@Documented
//@Constraint(validatedBy = {DirectorCodeValidator.class})
//public @interface DirectorCode {
//    String message() default " 请输入对应的机构码 ";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}

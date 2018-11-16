package com.framework.bean.annotation;

import com.framework.bean.validator.PageableValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author dongyl
 * @date 14:23 11/16/18
 * @project demo-spring-cloud
 */
@Target({TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {PageableValidator.class})
public @interface Pageable {
    String message() default " If pageable, pageNo and pageSize must be great than or equal to 1. ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

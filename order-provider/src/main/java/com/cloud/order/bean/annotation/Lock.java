package com.cloud.order.bean.annotation;

import java.lang.annotation.*;

/**
 * @author chenlihua
 * @date 2016/6/13
 * @time 14:49
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Lock {

}

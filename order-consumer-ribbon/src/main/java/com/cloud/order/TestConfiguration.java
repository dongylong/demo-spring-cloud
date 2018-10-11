package com.cloud.order;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongyl
 * @date 21:52 11/3/17
 * @project demo-spring-cloud
 */
@Configuration
@RibbonClient(name = "foo", configuration = FooConfiguration.class)
public class TestConfiguration {

}

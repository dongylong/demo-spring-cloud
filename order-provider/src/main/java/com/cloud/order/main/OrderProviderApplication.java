package com.cloud.order.main;

import com.cloud.order.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dongyl
 * @date 21:14 8/18/18
 * @project demo-spring-cloud
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "order-provider", configuration = TestConfiguration.class)
public class OrderProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProviderApplication.class, args);
    }
}

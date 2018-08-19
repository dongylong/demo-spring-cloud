package com.noriental.cloud;

import com.noriental.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dongyl
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-demo-user-provider", configuration = TestConfiguration.class)
public class CloudDemoUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoUserProviderApplication.class, args);
    }
}

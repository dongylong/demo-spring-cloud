package com.cloud.usersvr;

//import com.cloud.usersvr.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dongyl
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "user-provider", configuration = TestConfiguration.class)
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}

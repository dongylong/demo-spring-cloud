package com.cloud.discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dongyl
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplicationHA {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplicationHA.class, args);
    }
}

package com.noriental.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dongyl
 * @date 21:14 8/18/18
 * @project demo-spring-cloud
 */
@RestController
public class OrderController {
    @Autowired
    private DiscoveryClient discoveryClient;

//    @GetMapping("/simple/{id}")
//    public User findUser(@PathVariable Long id) {
//        return null;
//    }

    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("cloud-demo-user-provider");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }
    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }

}

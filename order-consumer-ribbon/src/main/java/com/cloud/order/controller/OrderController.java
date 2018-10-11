package com.cloud.order.controller;

import com.cloud.order.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project order-consumer
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/order/{id}")
    public User findUser(@PathVariable Long id) {
        User user = restTemplate.getForObject("http://user-provider:7900/simple/"+id, User.class);
        return user;
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("user-provider");
        System.out.println("host: "+serviceInstance.getHost()+"port:"+serviceInstance.getPort() +"serviceId: "+serviceInstance.getServiceId());
        return "1";
    }


}

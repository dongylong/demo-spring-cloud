package com.cloud.moviesvr.controller;

import com.cloud.moviesvr.bean.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project movie-consumer
 */
@RestController
@SessionScope
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallBack",commandProperties = @HystrixProperty(name = "execution.isolation.strategy",value = "Thread"))
    public User findUser(@PathVariable Long id) {
        User user = restTemplate.getForObject("http://user-provider:7900/simple/" + id, User.class);
        return user;
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("user-provider");
        System.out.println("host: " + serviceInstance.getHost() + "port:" + serviceInstance.getPort() + "serviceId: " + serviceInstance.getServiceId());
        return "1";
    }

    public User findByIdFallBack(Long id) {
        User user = new User();
        user.setId(0);
        return user;
    }


}

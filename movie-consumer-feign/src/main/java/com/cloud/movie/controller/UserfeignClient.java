package com.cloud.movie.controller;

import com.cloud.movie.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project movie-consumer
 */
@FeignClient("user-svr")
public interface UserfeignClient {

    /**
     * 1、@GetMapping 不支持
     * 2、@PathVariable得设置value
     * @param id
     * @return
     */
    @RequestMapping(value = "simple/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    User postUser(@RequestBody User user);

    /**
     * 该请求不会成功，只有参数是复杂对象，即使指定了GET方法，feign还是会以POST方法进行发送请求，其他注解？
     */
    @RequestMapping(value = "/get-user",method = RequestMethod.GET)
    User getUser(User user);

}

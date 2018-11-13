package com.cloud.movie.controller;

import com.cloud.movie.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project movie-consumer
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/movie/{id}")
    public User findUser(@PathVariable Long id) {
        return this.restTemplate.getForObject(userServicePath +id,User.class);
    }

}

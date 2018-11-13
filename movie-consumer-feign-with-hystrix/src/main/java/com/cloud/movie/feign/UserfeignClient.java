package com.cloud.movie.feign;

import com.cloud.movie.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}

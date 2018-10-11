package com.cloud.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongyl
 */
@EnableZuulProxy
@SpringCloudApplication
public class MovieConsumerFeignApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieConsumerFeignApplication.class, args);
		new SpringApplicationBuilder(MovieConsumerFeignApplication.class).web(true).run(args);
	}
}

package com.cloud.apigateway;

import com.cloud.apigateway.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * @author dongyl
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringCloudApplication
public class ApiGatewayZuulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayZuulApplication.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    /**
     * PatternServiceRouteMapper对象可以让开发者通过正则表达式自定义服务与路由映射的生成关系
     * @return
     */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        /**
         * servicePattern:匹配服务名称是否符合该自定义规则的正则表达式
         * 符合规则的服务名会有限使用该实现构建出的路径表达式
         * routePattern:根据服务名中定义的内容转换出的路径表达式规则
         * 未符合servicePattern 使用默认路由映射规则，采用完整服务名作为前缀的路径表达式
         */
        return new PatternServiceRouteMapper(
                "(?<name>^.+) - (?<version>v.+$)",
                "${version}/${name}");
    }
}

package com.cloud.apigateway.filter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dongyl
 * @date 15:19 9/26/18
 * @project demo-spring-cloud
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}

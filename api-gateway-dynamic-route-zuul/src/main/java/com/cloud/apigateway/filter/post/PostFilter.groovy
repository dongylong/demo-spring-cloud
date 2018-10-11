package com.cloud.apigateway.filter.post

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import java.lang.invoke.MethodHandles

class PostFilter extends ZuulFilter{

    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())
    @Override
    String filterType() {
        return "post"
    }

    @Override
    int filterOrder() {
        return 2000
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() {
        LOGGER.info("this is a post filter:Send {} request to {}",request.getMethod(),request.getRequestURL().toString())
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse()
        response.getOutputStream().print(", i am dongyl")
        response.flushBuffer()
//        return null
    }
}
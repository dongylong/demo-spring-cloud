package com.cloud.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodHandles;

/**
 * @author dongyl
 * @date 09:12 9/26/18
 * @project demo-spring-cloud
 */
public class AccessFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    /**
     * 过滤器类型
     * 决定过滤器在请求的那个生命周期中执行
     * @return
     */
    @Override
    public String filterType() {
        //pre 请求被路由之前执行
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * 请求在一个阶段中存在多个过滤器时，需要根据该方法返回的值一次执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断该过滤器是否需要被执行
     * 指定过滤器的有效范围
     * @return
     */
    @Override
    public boolean shouldFilter() {
        //该过滤器对所有请求都会生效。
        return true;
    }

    /**
     * 过滤器的具体逻辑。
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        LOGGER.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());
         Object accessToken = request.getParameter("accessToken");
         if(accessToken==null){
             LOGGER.warn("accessToken is empty");
             //过滤请求，不对其进行路由。
             ctx.setSendZuulResponse(false);
             //设置返回错误码
             ctx.setResponseStatusCode(401);
             return null;
         }
         LOGGER.info("access token ok");
        return null;
    }
}

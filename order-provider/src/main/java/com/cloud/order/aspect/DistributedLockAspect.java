//package com.noriental.cloud.order.aspect;
//
//import com.dongyl.utils.redis.RedisUtil;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.lang.invoke.MethodHandles;
//
///**
// * @author dongyl
// * @date 11:37 8/19/18
// * @project demo-spring-cloud
// */
//@Aspect
//@Component
//public class DistributedLockAspect {
//
//    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//
//    private static final String REDIS_LOCK_PREFIX = "REDIS_LOCK_SYSTEM_ID_";
//
//    @Resource
//    private RedisUtil redisUtil;
//
//    @Around("@annotation(com.noriental.cloud.order.bean.annotation.Lock)")
//    public Object addLock(ProceedingJoinPoint point) {
//        long systemId = 0;
//        Object proceed = null;
//        try {
//            Object[] args = point.getArgs();
//            if (args[0] instanceof RegisterRequest) {
//                RegisterRequest request = (RegisterRequest) args[0];
//                systemId = request.getSystemId();
//            } else {
//                systemId = (long) args[1];
//            }
//            String key = REDIS_LOCK_PREFIX + systemId;
//            logger.info("REDIS LOCK ADD: [{}]", key);
//            redisUtil.addLock(key, 3600, 10);
//            proceed = point.proceed();
//        } catch (Throwable throwable) {
//            logger.error("处理异常：", throwable);
//        } finally {
//            String key = REDIS_LOCK_PREFIX + systemId;
//            logger.info("REDIS LOCK DELETE: [{}]", key);
//            redisUtil.unLock(key);
//        }
//        return proceed;
//    }
//}

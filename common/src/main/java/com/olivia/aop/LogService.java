package com.olivia.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Aspect
@Component
@Slf4j
public class LogService {
    @Around("@annotation(com.olivia.aop.anno.LogAround)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        String args = Arrays.toString(point.getArgs());
        log.info("AOP_LOG into {} with {}", point.getStaticPart().toString(), args);
        Object result = point.proceed();
        log.info("AOP_LOG into {} with {}, result: {}", point.getStaticPart().toString(), args, result);
        return result;
    }
}

package com.lcb.aop.example;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lichangbao
 */
@Aspect
@Component
public class LouzaiAspect {
    @Pointcut("execution(* com.java.Louzai.everyDay())")
    private void myPointCut() {
    }


    @Before("myPointCut()")
    public void myBefore() {
        System.out.println("吃饭");
    }

    @AfterReturning(value = "myPointCut()")
    public void myAfterReturning() {
        System.out.println("打豆豆。。。");
    }
}
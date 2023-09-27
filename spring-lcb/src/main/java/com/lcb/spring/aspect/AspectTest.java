package com.lcb.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lichangbao
 * @since 2023/9/27 14:58
 */
@Aspect
@Component
public class AspectTest {

	@Pointcut("execution(* com.lcb.spring.test..*(..))")
	public void cutRestControllerAddress() {
	}

	@Before("cutRestControllerAddress()")
	public void cmdLimit() throws Throwable {
		System.out.println("aspect before");
	}
}

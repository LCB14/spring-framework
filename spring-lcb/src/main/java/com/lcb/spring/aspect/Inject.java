package com.lcb.spring.aspect;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichangbao
 * @since 2023/9/27 15:28
 */
@Service
public class Inject {
	@Resource
	private TestInject testInject;

	public void test(){
		testInject.test();
	}
}

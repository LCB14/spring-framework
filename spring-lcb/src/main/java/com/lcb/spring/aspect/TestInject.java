package com.lcb.spring.aspect;

import com.lcb.spring.aspect.InterfaceBean;
import com.lcb.spring.aspect.InterfaceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichangbao
 * @since 2023/9/27 14:51
 */
@Service
public class TestInject {

	@Resource
	private InterfaceImpl interfaceTest;

	@Resource
	private InterfaceBean interfaceBean;

	public void test() {
		interfaceTest.testA();
		interfaceTest.testB();
		interfaceBean.testBean();
	}
}

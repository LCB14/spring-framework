package com.lcb.spring.aspect;

import org.springframework.stereotype.Service;

/**
 * @author lichangbao
 * @since 2023/9/27 14:50
 */
@Service
public class InterfaceImpl implements InterfaceA, InterfaceB {
	@Override
	public void testA() {
		System.out.println("testA");
	}

	@Override
	public void testB() {
		System.out.println("testB");
	}
}

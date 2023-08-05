package com.lcb.spring.extention;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author changbao.l Date: 2023-07-30 Time: 11:20
 * @version $
 */
public class MyFactoryBean implements FactoryBean {
	private Class<?> mapper;

	public MyFactoryBean(Class<?> cla) {
		this.mapper = cla;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{mapper}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return null;
			}
		});
	}

	@Override
	public Class<?> getObjectType() {
		return mapper;
	}
}

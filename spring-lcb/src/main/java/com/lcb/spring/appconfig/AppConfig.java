package com.lcb.spring.appconfig;

import com.lcb.spring.bean.A;
import com.lcb.spring.bean.B;
import com.lcb.spring.bean.School;
import com.lcb.spring.bean.Student;
import com.lcb.spring.aspect.InterfaceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author changbao.li
 * @Description Java config
 * @Date 2019-06-22 16:01
 */
@Configuration
@ComponentScan("com.lcb")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public Student student(School school) {
		return new Student(school);
	}

	@Bean
	public School school() {
		return new School();
	}

	@Bean
	public A a() {
		return new A();
	}

	@Bean
	public B b(A a) {
		a();
		return new B(a);
	}

	@Bean
	public InterfaceBean interfaceBean() {
		return new InterfaceBean();
	}
}

package com.lcb.spring.test;

import com.lcb.spring.appconfig.AppConfig;
import com.lcb.spring.aspect.Inject;
import com.lcb.spring.bean.School;
import com.lcb.spring.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author changbao.li
 * @Description spring 特性测试
 * @Date 2019-06-22 16:00
 */
public class Test {

	/**
	 * spring 源码分析参考
	 * <@link https://blog.csdn.net/qq_35512802/article/details/131533905>
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);


		Student student = annotationConfigApplicationContext.getBean(Student.class);
		System.out.println(student);

		School school = (School) annotationConfigApplicationContext.getBean("school");
		System.out.println(school);

//		TestInject bean = annotationConfigApplicationContext.getBean(TestInject.class);
//		bean.test();

		Inject bean = annotationConfigApplicationContext.getBean(Inject.class);
		bean.test();
	}
}

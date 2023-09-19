package com.lcb.spring.extention;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author changbao.l Date: 2023-07-30 Time: 11:47
 * @version $
 * @descirotion 需要结合 @Import 注解一起使用
 */
public class ImportBeanDefinitionImpl implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 可以利用 registry 向容器注册 BeanDefinition

		// 构建 BeanDefinition 实例
//		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
//		BeanDefinition beanDefinition = builder.getBeanDefinition();

		/**
		 * 类的全限定名如何获取?
		 * 通过扫描指定路径下的包，来获取。
		 *
		 * beanName 如何获取？
		 * 扫描指定包下的接口或类，通过截取全限定名获取。
		 */
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("类的全限定名");
//		registry.registerBeanDefinition("beanName", beanDefinition);
	}
}

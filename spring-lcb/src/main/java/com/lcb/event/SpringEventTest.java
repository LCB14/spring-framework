package com.lcb.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author changbao.l Date: 2024-01-01 Time: 10:05
 * @version $
 */
@Component
public class SpringEventTest implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Spring 容器刷新成功！");
	}
}

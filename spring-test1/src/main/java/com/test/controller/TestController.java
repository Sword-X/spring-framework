package com.test.controller;

import com.test.config.TestConfig;
import com.test.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(TestConfig.class);
//		System.out.println(annotationConfigApplicationContext.getBean(TestService.class));
//		System.out.println(annotationConfigApplicationContext.getBean("testService"));

		// FactoryBean '&'测试
		Object user = annotationConfigApplicationContext.getBean("&user");
		Object user2 = annotationConfigApplicationContext.getBean("user");
		System.out.println(user.toString());	// com.test.configuration.UserFactoryBean@491666ad
		System.out.println(user2.toString());	// User{name='zhangsan', age=18}
	}
}

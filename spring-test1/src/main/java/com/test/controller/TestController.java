package com.test.controller;

import com.test.config.TestConfig;
import com.test.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(TestConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(TestService.class));
	}
}

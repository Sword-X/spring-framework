package com.test.factoryBeanAndBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanA implements FactoryBean<NormalBeanA> {

	@Autowired
	private ApplicationContext context;

	@Override
	public NormalBeanA getObject() throws Exception {
		NormalBeanA normalBeanA = new NormalBeanA();
		NormalBeanB normalBeanB = context.getBean("normalBeanB", NormalBeanB.class);
		normalBeanA.setNormalBeanB(normalBeanB);
		return normalBeanA;
	}

	@Override
	public Class<?> getObjectType() {
		return NormalBeanA.class;
	}
}

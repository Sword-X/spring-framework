package com.test.factoryBeanAndBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NormalBeanB {
	@Autowired
	private NormalBeanA normalBeanA;
}

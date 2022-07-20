package com.test.configuration;

import com.test.pojo.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

@Service("user")
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User("zhangsan",18);
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}

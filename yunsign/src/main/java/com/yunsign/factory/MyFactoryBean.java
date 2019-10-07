package com.yunsign.factory;

import com.yunsign.invocation.MyInvocationHandler;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

//@Component
public class MyFactoryBean implements FactoryBean {

	private Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {

		Class [] clazzs = new Class[]{clazz};

		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),clazzs,new MyInvocationHandler());

		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}

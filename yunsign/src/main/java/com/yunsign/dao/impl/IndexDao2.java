package com.yunsign.dao.impl;

import com.yunsign.dao.Dao;
import com.yunsign.invocation.MyInvocationHandler;
import com.yunsign.invocation.MyInvocationHandler2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Proxy;

public class IndexDao2 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("beanName==="+beanName);
		if(beanName.equals("indexDao")) {
			//返回一个代理对象
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{IndexDao.class}, new MyInvocationHandler2(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}

package com.yunsign.invocation;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("模拟 ImportBeanDefinitionRegistrar，将自定义的对象注册到spring中");
		Method m = proxy.getClass().getInterfaces()[0].getMethod(method.getName(),String.class);
		Select select = m.getDeclaredAnnotation(Select.class);
		System.out.println(select.value()[0]);
		return null;
	}
}

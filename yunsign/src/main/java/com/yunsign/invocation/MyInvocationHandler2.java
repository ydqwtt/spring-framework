package com.yunsign.invocation;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler2 implements InvocationHandler {

	private Object target;

	public MyInvocationHandler2(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyInvocationHandler2");
		return method.invoke(target,args);
	}
}

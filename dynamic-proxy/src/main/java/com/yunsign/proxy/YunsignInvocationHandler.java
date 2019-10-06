package com.yunsign.proxy;

import com.yunsign.dao.UserDao;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class YunsignInvocationHandler implements InvocationHandler {

	Object target;

	public YunsignInvocationHandler(Object target) {
		this.target = target;
	}

	/**
	 *
	 * @param proxy 代理对象
	 * @param method 目标对象方法
	 * @param args	目标对象方法
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		byte [] bytes = ProxyGenerator.generateProxyClass("UserDaoImpl",new Class[]{UserDao.class});
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:\\UserDao.class"));
			fos.write(bytes);
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("动态代理");
		System.out.println(proxy.getClass().getName());
		return method.invoke(target,args);
	}
}

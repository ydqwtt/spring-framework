package com.yunsign.util;

import com.yunsign.annotation.Entity;

import java.lang.annotation.Annotation;

public class CommonUtil {

	public static String buildQuerySql(Object obj){

		Class clazz =  obj.getClass();
		//是否存在注解
		System.out.println(clazz.isAnnotationPresent(Entity.class));
		Annotation annotation = clazz.getAnnotation(Entity.class);
		System.out.println(((Entity)annotation).value());
		return "";
	}
}

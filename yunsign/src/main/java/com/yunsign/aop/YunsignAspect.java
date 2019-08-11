package com.yunsign.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class YunsignAspect {

	//定义一个切点方法
	@Pointcut("execution(* com.yunsign.dao.*.*(..))")
	public void pointCutExecution(){

	}

	/**
	 * within的最小颗粒度是类，execution可以是任意类和方法，参数
	 */
	@Pointcut("within(com.yunsign.dao..*)")
	public void pointCutWithin(){

	}

	/**
	 * 只跟方法参数类型匹配
	 */
	@Pointcut("args(java.lang.String)")
	public void pointCutArgs(){

	}

	/**
	 * 基于注解的匹配
	 */
	@Pointcut("@annotation(com.yunsign.annotation.Entity)")
	public void pointCutAnnotation(){

	}

	/**
	 * 匹配代理对象是否为com.yunsign.dao.Dao类型，如果是则增强
	 */
	@Pointcut("this(com.yunsign.dao.Dao)")
	public void pointCutThis(){

	}

	/**
	 * 匹配目标对象是否为com.yunsign.dao.impl.IndexDao类型，如果是则增强
	 */
	@Pointcut("target(com.yunsign.dao.impl.IndexDao)")
	public void pointCutTarget(){

	}
	//定义通知
	@Before("pointCutThis()")
	public void before(){
		System.out.println("pointCut.before");
	}
}

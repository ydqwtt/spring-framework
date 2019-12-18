package com.yunsign.aop;

import com.yunsign.dao.Dao;
import com.yunsign.dao.impl.IndexDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class YunsignAspect {

	/**
	 * 将目标对象实现Dao，里面的方法按IndexDao里执行
	 */
	@DeclareParents(value = "com.yunsign.dao.impl.*",defaultImpl = IndexDao.class)
	private Dao dao;

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
	public void before(JoinPoint joinPoint){
//		System.out.println("pointCut.before");
	}

	@Before("pointCutThis()")
	public void after(){
//		System.out.println("pointCut.after");
	}

//	@Around("pointCutThis()")
	public void around(ProceedingJoinPoint proceedingJoinPoint){
//		System.out.println("pointCut.around.a");
		Object [] args = proceedingJoinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			args[i] += " world !";
		}
		try {
			proceedingJoinPoint.proceed(args);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
//		System.out.println("pointCut.around.b");
	}
}

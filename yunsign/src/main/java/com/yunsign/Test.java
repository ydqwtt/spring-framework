package com.yunsign;

import com.yunsign.config.Appconfig;
import com.yunsign.dao.CardDao;
import com.yunsign.dao.Dao;
import com.yunsign.dao.impl.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
			annotationConfigApplicationContext.register(Appconfig.class);
			annotationConfigApplicationContext.refresh();
//			annotationConfigApplicationContext.getEnvironment().setDefaultProfiles("test1");
//			annotationConfigApplicationContext.register(Appconfig.class);
//			annotationConfigApplicationContext.refresh();
//			Dao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
//			Dao indexDao2 = annotationConfigApplicationContext.getBean(IndexDao.class);
//			System.out.println(indexDao.hashCode());
//			System.out.println(indexDao2.hashCode());
			CardDao cardDao = (CardDao) annotationConfigApplicationContext.getBean("cardDao");
			cardDao.list("123");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

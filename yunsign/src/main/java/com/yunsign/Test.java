package com.yunsign;

import com.yunsign.config.Appconfig;
import com.yunsign.dao.Dao;
import com.yunsign.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.refresh();

		Dao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		Dao indexDao2 = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(indexDao.hashCode());
		System.out.println(indexDao2.hashCode());
		indexDao.query();

	}
}

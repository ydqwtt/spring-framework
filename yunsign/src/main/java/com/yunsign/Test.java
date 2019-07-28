package com.yunsign;

import com.yunsign.config.Appconfig;
import com.yunsign.dao.Dao;
import com.yunsign.dao.Indexdao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Wrapper;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.refresh();

		Dao indexDao = annotationConfigApplicationContext.getBean(Indexdao.class);
		Dao indexDao2 = annotationConfigApplicationContext.getBean(Indexdao.class);
		System.out.println(indexDao.hashCode());
		System.out.println(indexDao2.hashCode());
		indexDao.query();

	}
}

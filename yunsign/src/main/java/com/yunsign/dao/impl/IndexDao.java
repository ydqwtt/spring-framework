package com.yunsign.dao.impl;

import com.yunsign.annotation.Entity;
import com.yunsign.dao.Dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value = "indexDao")

public class IndexDao implements Dao {
	@Entity
	@Override
	public void query() {
		System.out.println("IndexDao.query Method");
	}

	@Override
	public void query(String str) {
		System.out.println("IndexDao.query Method:"+str);
	}
}

package com.yunsign.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class IndexDao implements Dao{
	@Override
	public void query() {
		System.out.println("IndexDao.query Method");
	}
}

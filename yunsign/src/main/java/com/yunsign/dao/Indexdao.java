package com.yunsign.dao;

import org.springframework.stereotype.Component;

@Component
public class Indexdao implements Dao{
	@Override
	public void query() {
		System.out.println("Indexdao.query");
	}
}

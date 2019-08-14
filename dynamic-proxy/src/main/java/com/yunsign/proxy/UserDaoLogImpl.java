package com.yunsign.proxy;

import com.yunsign.dao.UserDao;

public class UserDaoLogImpl implements UserDao {

	private UserDao userDao;

	public UserDaoLogImpl(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public void query() {
		System.out.println("日志代理");
		userDao.query();
	}
}

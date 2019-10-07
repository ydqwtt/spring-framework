package com.yunsign.dao;

import org.apache.ibatis.annotations.Select;

public interface CardDao {
	@Select("select * from T1")
	public void list(String str);
}

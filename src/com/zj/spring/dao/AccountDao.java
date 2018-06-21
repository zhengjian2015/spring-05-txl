package com.zj.spring.dao;

public interface AccountDao {
	void addMoney(Integer id,double money);
	
	void subMoney(Integer id,double money);
}

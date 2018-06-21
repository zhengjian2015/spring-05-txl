package com.zj.spring.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zj.spring.dao.AccountDao;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Resource(name="accountDao")
	private AccountDao accountDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,isolation=Isolation.REPEATABLE_READ)
	public void transfer(Integer from, Integer to, double money) {
		// TODO Auto-generated method stub
		accountDao.subMoney(from, money);
		int b=1/0;
		accountDao.addMoney(to, money);
	}

}

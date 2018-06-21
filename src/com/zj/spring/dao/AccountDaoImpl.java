package com.zj.spring.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service("accountDao")
public class AccountDaoImpl implements AccountDao {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jt;
	
	
	@Override
	public void addMoney(Integer id, double money) {
		// TODO Auto-generated method stub
		String sql = "update  ar_account set money = money + ? where id = ?";
		jt.update(sql, money,id);
	}

	@Override
	public void subMoney(Integer id, double money) {
		String sql = "update  ar_account set money = money - ? where id = ?";
		jt.update(sql, money,id);
		
	}
	
	

}

package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImp implements LoginDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public MyUser authenticateUser(String username, String password) {
		try {
		MyUser u = jdbcTemplate.queryForObject("select username,password from myuser where username=? and password=?", 
				new Object[] {username,password},
				BeanPropertyRowMapper.newInstance(MyUser.class));
		System.out.println(u);
				return u;
		}catch(Exception e) {
			System.out.println("User Not Found");
		}
		return null;
	}

}

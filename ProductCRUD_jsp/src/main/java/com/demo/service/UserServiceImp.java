package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImp;
import com.demo.beans.MyUser;


public class UserServiceImp implements UserService
{
	UserDao udao;
	public UserServiceImp()
	{
		udao=new UserDaoImp();
	}
	@Override
	public MyUser validateUser(String uname, String pass) {
		return udao.validateData(uname,pass);
	}
	
	
}

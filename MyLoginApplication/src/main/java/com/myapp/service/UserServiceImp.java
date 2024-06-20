package com.myapp.service;

import com.myapp.dao.UserDao;
import com.myapp.dao.UserDaoImp;
import com.myapp.beans.MyUser;
import com.myapp.beans.RegisterUser;

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
	@Override
	public boolean registerUser(RegisterUser user) {
		return udao.registerUser(user);
	}
	@Override
	public RegisterUser findQuestion(String name) {
	return udao.findQuestion(name);
	}
	@Override
	public boolean changePassword(String uname, String newpass) {
		return udao.changePassword(uname,newpass);
	}
	
}

package com.myapp.service;

import com.myapp.beans.MyUser;
import com.myapp.beans.RegisterUser;

public interface UserService 
{
	MyUser validateUser(String uname, String pass);

	boolean registerUser(RegisterUser user);

	RegisterUser findQuestion(String name);

	boolean changePassword(String uname, String newpass);

}

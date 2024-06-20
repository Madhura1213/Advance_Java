package com.demo.service;

import com.demo.beans.MyUser;

public interface UserService 
{
	MyUser validateUser(String uname, String pass);

}

package com.myapp.dao;

import com.myapp.beans.MyUser;
import com.myapp.beans.RegisterUser;

public interface UserDao {

	MyUser validateData(String uname, String pass);

	boolean registerUser(RegisterUser user);

	RegisterUser findQuestion(String name);

	boolean changePassword(String uname, String newpass);
}

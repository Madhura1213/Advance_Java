package com.demo.dao;

import com.demo.beans.MyUser;

public interface UserDao {

	MyUser validateData(String uname, String pass);


}

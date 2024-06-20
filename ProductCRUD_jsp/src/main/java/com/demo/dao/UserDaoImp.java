package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;


public class UserDaoImp implements UserDao
{
	static Connection con;
	static PreparedStatement pvalidate;
	static{
	con=JDBCConnection.getMyConnection();
	try {
		
		pvalidate= con.prepareStatement("select username, password from user where username=? and password=?");
	
	} catch (SQLException e) {
		e.printStackTrace(); }
	}
	
	@Override
	public MyUser validateData(String uname, String pass) { 
 try
	{
		pvalidate.setString(1,uname);
		pvalidate.setString(2,pass);
		ResultSet rs=pvalidate.executeQuery();
		if(rs.next()){
		MyUser user =new MyUser(rs.getString(1),rs.getString(2));
		 return user;
		 
		}	
	}catch(SQLException e)	{
		e.printStackTrace();
	}
	return null;
 }


}

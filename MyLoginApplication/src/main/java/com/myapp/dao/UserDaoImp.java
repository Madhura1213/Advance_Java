package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myapp.beans.MyUser;
import com.myapp.beans.RegisterUser;

public class UserDaoImp implements UserDao
{
	static Connection con;
	static PreparedStatement pvalidate, pregister,pinsert,pfindQ,pchangePass,pchangePass2;
	static{
	con=JDBCConnection.getMyConnection();
	try {
		pinsert= con.prepareStatement("insert into user(username, password) values (?,?)");
		pvalidate= con.prepareStatement("select username, password from user where username=? and password=?");
		pregister= con.prepareStatement("insert into registration values (?,?,?,?,?,?,?,?)");
		pfindQ= con.prepareStatement("select username, question, answer from registration where username= ?");
		pchangePass = con.prepareStatement("update user set password =? where username =?");
		pchangePass2= con.prepareStatement("update registration set pass =? where username =?");
	
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

	@Override
	public boolean registerUser(RegisterUser user) {
		try {
		pregister.setString(1,user.getName());
		pregister.setString(2,user.getGender());
		pregister.setString(3,user.getSkill()[0]);
		pregister.setString(4,user.getSkill()[1]);
		pregister.setString(5,user.getUsername());
		pregister.setString(6,user.getPassword());
		pregister.setString(7,user.getQuestion());
		pregister.setString(8,user.getAnswer());
		pregister.executeUpdate();
		
		pinsert.setString(1,user.getUsername());
		pinsert.setString(2,user.getPassword());
		pinsert.executeUpdate();
		
		return true;
		} catch (SQLException e) {
			e.printStackTrace(); }
		return false;
	}

	@Override
	public RegisterUser findQuestion(String name) {
	try {
		pfindQ.setString(1, name);
		ResultSet rs = pfindQ.executeQuery();
		if(rs.next()) {
		RegisterUser user = new RegisterUser(rs.getString(1),rs.getString(2),rs.getString(3));
		return user;
		
		}
	} catch (SQLException e) {
		e.printStackTrace();  }
	
		return null;
	}

	@Override
	public boolean changePassword(String uname, String newpass) {
   try {
		pchangePass.setString(1, newpass);
		pchangePass.setString(2, uname);
		pchangePass.executeUpdate();
		
		pchangePass2.setString(1, newpass);
		pchangePass2.setString(2, uname);
		pchangePass2.executeUpdate();
		
		return true;
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return false;
	}

}

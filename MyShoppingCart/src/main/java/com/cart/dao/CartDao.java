package com.cart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cart.beans.MyUser;

public class CartDao implements ICartDao{

	static Connection con;
	static PreparedStatement pvalidate;
	static {
	try {
		con=JDBCConnection.getMyConnection();
		pvalidate= con.prepareStatement("select * from user where username=? and password =?");

	
	} catch (SQLException e) {
		e.printStackTrace();
	}		
  }
	
	@Override
	public MyUser validateUser(String username, String password) {
		try {
			pvalidate.setString(1, username);
			pvalidate.setString(2, password);
			ResultSet rs= pvalidate.executeQuery();
			MyUser user= null ;
			if(rs.next()) {
				 user = new MyUser(username, password);
			}
			return user;	
		} catch (SQLException e) {
			e.printStackTrace();
		}return null;
	}

}

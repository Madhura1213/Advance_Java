package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;


public class JDBCConnection {
	
	public static Connection getMyConnection() {
		
	try {//driver creates brigde between java n mysql
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:mysql://192.168.10.150/dac38?useSSL=false";
		String uname = "dac38";
		String pass= "welcome";
		Connection mycon= DriverManager.getConnection(url, uname, pass);
		testMyConnection(mycon);
		return mycon;
	} catch (SQLException e) {
		e.printStackTrace();	}
	return null;
	}
	
	public static void closeMyConnection(Connection con) {
		try {
			con.close();
			System.out.println("Server Disconnected Successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void testMyConnection(Connection con) {
		if(con!=null) {
			System.out.println("Connection Established !!");
		}else
			System.out.println("Unable to Establish Connection");
	}
}

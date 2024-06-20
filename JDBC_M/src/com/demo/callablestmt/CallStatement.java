package com.demo.callablestmt;
import java.sql.*;
import com.demo.connection.JDBCConnection;

public class CallStatement {

	public void myCallStatement(){
	JDBCConnection conn = new JDBCConnection();
	Connection con= conn.getMyConnection();
	
	try {
		CallableStatement cs = con.prepareCall("{call getcnt(?,?)}");
		cs.setInt(1, 100);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		int num = cs.getInt(2);
		System.out.println("Count : "+num);
		
	} catch (SQLException e){
		e.printStackTrace();
	}
	
	}
}

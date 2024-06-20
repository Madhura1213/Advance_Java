package com.demo.preparestmt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.connection.*;
public class PrepareStatement {
	
	public void myprepStatement() {
		try {
			//Establish connection
	System.out.println("In Prepared Statement ->");
	JDBCConnection connection = new JDBCConnection(); 
	Connection con = connection.getMyConnection();
	
	
	//Bind query to Prepare Statement
	PreparedStatement ps= con.prepareStatement("select * from food where rate>=?");
	int rate = 400;
	ps.setInt(1,rate);
	ResultSet rs =ps.executeQuery();
	
	//Print Result set
	while(rs.next()) {
		System.out.println("Product: "+rs.getString(1)
		+ " Product Rate :"+rs.getInt(2));
	}
	}catch(Exception e) {
		System.out.println("Exception");
	}
	}
}

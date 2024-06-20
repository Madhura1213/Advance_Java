package com.demo.stmt;

import java.sql.*;
import java.util.Scanner;

import com.demo.connection.JDBCConnection;

public class Statement1 {

	public void myCreateStatement() {
		JDBCConnection connection = new JDBCConnection(); 
		Connection con = connection.getMyConnection();
		 try{ 
			 Scanner sc = new Scanner(System.in);
		 Statement st = con.createStatement();
		 System.out.println("In Statement Block\nEnter details to Add in Database :  ");
		 System.out.println("Enter Product Name : ");
		 String name = sc.next();
		 System.out.println("Enter Product Price : ");
		 int rate = sc.nextInt();
		 
		 //Binding query at execution
		 int rowsaffected = st.executeUpdate("insert into food values('"+name+"',"+rate+")");
		 if(rowsaffected>0) {
		 	System.out.println("Query Executed");
	  	    }
		 
		 //Print the Result Set
		 ResultSet result = st.executeQuery("select * from food");
		 while(result.next()) {
			 System.out.println("Product : "+result.getString(1)+"\n Price : "+result.getInt(2));
		 }
	 }
		 
		 catch(Exception e){
			 System.out.println("Exception Occured");
		 }
		
	}
}

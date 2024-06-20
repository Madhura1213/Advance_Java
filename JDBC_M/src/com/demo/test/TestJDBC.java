package com.demo.test;

import com.demo.callablestmt.CallStatement;
import com.demo.connection.JDBCConnection;
import com.demo.preparestmt.PrepareStatement;
import com.demo.stmt.Statement1;

public class TestJDBC {

	public static void main(String[] args) {
		
		System.out.println("To Establishing Connection :"); 
		JDBCConnection con = new JDBCConnection();
		con.getMyConnection();

		System.out.println();
		System.out.println("Executing Query :"); 
		PrepareStatement ps= new PrepareStatement();
		ps.myprepStatement();
		
		System.out.println();
		Statement1 st = new Statement1();
		st.myCreateStatement();
		
		System.out.println();
		CallStatement cs = new CallStatement();
		cs.myCallStatement();
		
}
}
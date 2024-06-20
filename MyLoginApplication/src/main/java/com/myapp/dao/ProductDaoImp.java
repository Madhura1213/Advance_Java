package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myapp.beans.MyUser;
import com.myapp.beans.Product;

public class ProductDaoImp implements ProductDao
{
	static Connection con;
	static PreparedStatement pdisplay;
	static
	{
		con=JDBCConnection.getMyConnection();
		try {
			pdisplay= con.prepareStatement("select * from product");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Product> findAllProducts() {
		try {
			List<Product> plist = new ArrayList<>();
			ResultSet rs = pdisplay.executeQuery();
			while(rs.next()) {
				Product product = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
				plist.add(product);
			}
			return plist;
		} catch (SQLException e) {
			e.printStackTrace();	}
		return null;
	}
	
	
}

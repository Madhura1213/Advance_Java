package com.cart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cart.beans.Category;
import com.cart.beans.MyUser;
import com.cart.beans.Product;

public class ProductDao implements IProductDao{

	static Connection con;
	static PreparedStatement pcatselect,pfindproduct;
	static {
		con=JDBCConnection.getMyConnection();
	try {
	pcatselect= con.prepareStatement("select * from category");
	pfindproduct=con.prepareStatement("select * from productcategory where catid =? ");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
  }
	@Override
	public List<Category> findAll() {
		ResultSet rs;
		try {
			rs = pcatselect.executeQuery();
			List<Category> clist = new ArrayList<>();
			while(rs.next()) {
			Category category = new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
			clist.add(category);
			} 
			return clist;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Product> findProducts(int cartid) {
		try {
			List<Product> productlist = new ArrayList<>();
			pfindproduct.setInt(1, cartid);
			ResultSet rs= pfindproduct.executeQuery();
			
			while(rs.next()) {
				Product product = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
				productlist.add(product);
			}
			return productlist;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	

}

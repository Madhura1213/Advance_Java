package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Product;

public class ProductDaoImp implements ProductDao
{
	static Connection con;
	static PreparedStatement pdisplay,pinsert;
	static{
	con=JDBCConnection.getMyConnection();
	try {
		pdisplay= con.prepareStatement("select * from product");
		pinsert= con.prepareStatement("insert into product(name,QTY,price) values (?,?,?)");
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
	@Override
	public int addnewProduct(Product product) {
		try {
		pinsert.setString(2, product.getPname());
		pinsert.setInt(3, product.getQty());
		pinsert.setFloat(4, product.getPrice());
		
		return pinsert.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();}
	return 0;
	}
	
	
}

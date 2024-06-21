package com.cart.dao;

import java.util.List;

import com.cart.beans.Category;
import com.cart.beans.MyUser;
import com.cart.beans.Product;

public interface IProductDao {

	List<Category> findAll();

	List<Product> findProducts(int cartid);

	

}

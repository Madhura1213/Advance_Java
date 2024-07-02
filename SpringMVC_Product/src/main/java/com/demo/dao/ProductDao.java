package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	int insertproduct(Product prod);

	Product findById(int pid);

	int updateProduct(Product p);

	int removeProduct(int pid);

}

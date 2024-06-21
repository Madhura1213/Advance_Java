package com.cart.service;

import java.util.List;

import com.cart.beans.Category;
import com.cart.beans.Product;

public interface IProductService {

	List<Category> getAll();

	List<Product> findAllProduct(int cartid);


}

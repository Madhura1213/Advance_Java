package com.cart.service;

import java.util.List;

import com.cart.beans.Category;
import com.cart.beans.Product;
import com.cart.dao.IProductDao;
import com.cart.dao.ProductDao;

public class ProductService implements IProductService{

	IProductDao pdao;
	public ProductService() {
		pdao= new ProductDao();
	}
	
	@Override
	public List<Category> getAll() {
		return pdao.findAll();
	}

	@Override
	public List<Product> findAllProduct(int cartid) {
		return pdao.findProducts(cartid);
	}

}

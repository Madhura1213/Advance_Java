package com.demo.service;

import com.demo.beans.Product;
import com.demo.dao.*;

import java.util.List;


public class ProductServiceImp implements ProductService
{
	ProductDao pdao;
	public ProductServiceImp()
	{
		pdao=new ProductDaoImp();
	}
	@Override
	public List<Product> getAllProducts() {
		return pdao.findAllProducts();
	}
	@Override
	public int addProduct(Product product) {
		return pdao.addnewProduct(product);
	}
	

	
}

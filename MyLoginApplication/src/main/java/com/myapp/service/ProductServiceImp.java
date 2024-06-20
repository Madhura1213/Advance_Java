package com.myapp.service;

import com.myapp.dao.*;
import java.util.List;
import com.myapp.beans.Product;

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
	
	
}

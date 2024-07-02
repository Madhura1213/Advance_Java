package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao pdao = new ProductDaoImpl();

	@Override
	public List<Product> getAllproducts() {
		return pdao.findAllProducts();
	}

	@Override
	public int addproduct(Product prod) {
		return pdao.insertproduct(prod);
	}

	@Override
	public Product getById(int pid) {	
		return pdao.findById(pid);
	}

	@Override
	public int modifyProduct(Product p) {
		return pdao.updateProduct(p);
	}

	@Override
	public int deleteProduct(int pid) {
		return pdao.removeProduct(pid);
	}
	
	
	
}

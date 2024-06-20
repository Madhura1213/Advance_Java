package com.myapp.dao;

import java.util.List;
import com.myapp.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	
}

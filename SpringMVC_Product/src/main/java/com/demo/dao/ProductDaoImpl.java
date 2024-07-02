package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> findAllProducts() {
	List<Product> plist = new ArrayList<>();
	RowMapper rm = (rs,num)->{
		Product p = new Product();
		p.setId(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setQty(rs.getInt(3));
		p.setPrice(rs.getDouble(4));
		return p;
	};
	plist = jdbcTemplate.query("select * from product", rm);
		return plist;
	}

	@Override
	public int insertproduct(Product prod) {
		return jdbcTemplate.update("insert into product values (?,?,?,?)",
	new Object[] { prod.getId(),prod.getName(),prod.getQty(),prod.getPrice()});
		
	}

	@Override
	public Product findById(int pid) {
		return jdbcTemplate.queryForObject("select * from product where id=?", 
				new Object[] {pid},
				BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public int updateProduct(Product p) {
		return jdbcTemplate.update("update product set name=?,qty=?,price=? where id=?",
				new Object[] {p.getName(),p.getQty(),p.getPrice(),p.getId()});
	}

	@Override
	public int removeProduct(int pid) {
		return jdbcTemplate.update("delete from Product where id=?", 
				new Object[] {pid});
	}	
}

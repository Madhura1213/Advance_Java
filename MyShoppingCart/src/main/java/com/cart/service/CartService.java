package com.cart.service;

import com.cart.beans.MyUser;
import com.cart.dao.CartDao;
import com.cart.dao.ICartDao;

public class CartService implements ICartService {

	ICartDao cdao;
	public CartService() {
		cdao= new CartDao();
	}
	@Override
	public MyUser validateUser(String username, String password) {
		return cdao.validateUser(username,password);
	}

}

package com.cart.dao;

import com.cart.beans.MyUser;

public interface ICartDao {

	MyUser validateUser(String username, String password);

}

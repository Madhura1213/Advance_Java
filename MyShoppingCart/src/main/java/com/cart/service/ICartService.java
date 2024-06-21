package com.cart.service;

import com.cart.beans.MyUser;

public interface ICartService {

	MyUser validateUser(String username, String password);

}

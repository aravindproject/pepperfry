package com.pepperfry.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pepperfry.dao.CartDAO;
import com.pepperfry.model.Cart;



public abstract class CartServiceImp implements CartService {

	@Autowired
	private CartDAO cartDAO;
	
	public Cart getCartById(String cartId) {
		// TODO Auto-generated method stub
		return cartDAO.getCartById(cartId);
	}

	public Cart validate(String cartId) throws IOException {
		// TODO Auto-generated method stub
		return cartDAO.validate(cartId);
	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.update(cart);
	}

	@Override
	public List<Cart> getCartByUsername(String username) {
		// TODO Auto-generated method stub
		return cartDAO.getCartByUsername(username);
	}

}

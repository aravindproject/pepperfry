package com.pepperfry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pepperfry.dao.CartItemDAO;
import com.pepperfry.model.CartItem;

public class CartItemServiceImp implements CartItemService {

	@Autowired
	private CartItemDAO cartItemDAO; 
	@Override
	public void addCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.addCart(cartItem);
	}

	@Override
	public void removeCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.removeCart(cartItem);
	}

	@Override
	public void removeAllCart(CartItem cart) {
		// TODO Auto-generated method stub
		cartItemDAO.removeAllCart(cart);
	}

	@Override
	public List<CartItem> list() {
		// TODO Auto-generated method stub
		return cartItemDAO.list();
	}

}

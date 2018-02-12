package com.pepperfry.service;

import java.util.List;

import com.pepperfry.model.CartItem;



public interface CartItemService {

	public void addCart(CartItem cartItem);
	public void removeCart(CartItem cartItem);
	public void removeAllCart(CartItem cart);
	public List<CartItem> list();
}

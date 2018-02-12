package com.pepperfry.dao;



import java.util.List;

import com.pepperfry.model.CartItem;


public interface CartItemDAO {

	public void addCart(CartItem cartItem);
	public void removeCart(CartItem cartItem);
	public void removeAllCart(CartItem cart);
	public List<CartItem> list();
}

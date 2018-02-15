package com.pepperfry.dao;



import java.util.List;

import com.pepperfry.model.CartItem;


public interface CartItemDAO {

	public static void addCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}
	public void removeCart(CartItem cartItem);
	public void removeAllCart(CartItem cart);
	public List<CartItem> list();
}

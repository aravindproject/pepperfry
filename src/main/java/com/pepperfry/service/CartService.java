package com.pepperfry.service;

import java.io.IOException;
import java.util.List;

import com.pepperfry.model.Cart;



public interface CartService {

	Cart getCartById1(String cartId);

	Cart validate(String cartId) throws IOException;

	void update(Cart cart);

	List<Cart> getCartByUsername(String username);

	Cart validate1(String cartId) throws IOException;

	Cart getCartById(String cartId);
}

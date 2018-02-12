package com.pepperfry.dao;

import java.io.IOException;
import java.util.List;

import com.pepperfry.model.Cart;



public interface CartDAO {

	Cart getCartById(String cartId);

	Cart validate(String cartId) throws IOException;

	void update(Cart cart);

	List<Cart> getCartByUsername(String username);
}

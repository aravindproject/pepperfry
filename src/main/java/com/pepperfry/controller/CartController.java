package com.pepperfry.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pepperfry.dao.CartItemDAO;
import com.pepperfry.dao.UserDAO;
import com.pepperfry.model.CartItem;
import com.pepperfry.model.Product;
import com.pepperfry.model.User;



@Controller
public class CartController<ProductDAO, CartDAO, Cart> {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value = ("/addtocart"), method = RequestMethod.GET)
	public ModelAndView addtocart(@RequestParam("productPid") String pid,Principal principal)
	{
		User user= userDAO.getuser(principal.getName());
		com.pepperfry.model.Cart cart= user.getCart();
		Product product = ((com.pepperfry.dao.ProductDAO) productDAO).getproduct(pid);
		List<CartItem>cartItems= cart.getCartItem();
		
		  for (int i=0; i<cartItems.size(); i++)
		  {
	          if(product.getPid()==cartItems.get(i).getProduct().getPid())
	          {
	                CartItem cartItem = cartItems.get(i);
	                cartItem.setName(product.getPname());
	                cartItem.setPrice(product.getPrice());
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotalPrice(product.getPrice());
	                CartItemDAO.addCart(cartItem);
	          }
	      }
		  
		  CartItem cartItem = new CartItem();
	      cartItem.setProduct(product);
	      cartItem.setName(product.getPname());
	      cartItem.setPrice(product.getPrice());
	      cartItem.setQuantity(1);
	      cartItem.setTotalPrice(product.getPrice());
	      cartItem.setCart(cart);
	      CartItemDAO.addCart(cartItem);
	      	
	      return new ModelAndView("listAllProuducts");
	}
}

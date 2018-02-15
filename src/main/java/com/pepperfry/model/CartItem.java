package com.pepperfry.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CartItem implements Serializable{

	private static final long serialVersionUID = 14L;

	@Id
	@GeneratedValue
	private String Ciid;
	
	@ManyToOne
    @JoinColumn(name = "cartid")
	private Cart cart;
	
	@ManyToOne
    @JoinColumn(name = "pid")
	private Product product;
	
	private String name;
	private Long price;
	private String quantity;
	public String getCiid() {
		return Ciid;
	}
	public void setCiid(String ciid) {
		Ciid = ciid;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String i) {
		this.quantity = i;
	
	}
	public void setQuantity(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setTotalPrice(long price2) {
		// TODO Auto-generated method stub
		
	}
	
		
	}
	
	



package com.pepperfry.service;

import java.util.ArrayList;

import com.pepperfry.model.Product;

public interface ProductService {

	public void createorupdate(Product obj);
	public void delete(String pid);
	public Product getproduct(String pid);
	public ArrayList<Product> getproduct();
}

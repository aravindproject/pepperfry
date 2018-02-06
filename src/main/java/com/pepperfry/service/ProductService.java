package com.pepperfry.service;

import java.util.ArrayList;

import com.pepperfry.model.Product;

public interface ProductService {

	public void createorupdate(Product obj);
	public void delete(Integer pid);
	public Product getproduct(Integer pid);
	public ArrayList<Product> getproduct();
}

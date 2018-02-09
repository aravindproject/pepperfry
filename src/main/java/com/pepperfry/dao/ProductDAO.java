package com.pepperfry.dao;

import java.util.ArrayList;

import com.pepperfry.model.Product;

public interface ProductDAO {

	public void createorupdate(Product obj);
	public void delete(String pid);
	public Product getproduct(String pid);
	public ArrayList<Product> getproduct();
}

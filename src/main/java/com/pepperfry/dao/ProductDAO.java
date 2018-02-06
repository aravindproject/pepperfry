package com.pepperfry.dao;

import java.util.ArrayList;

import com.pepperfry.model.Product;

public interface ProductDAO {

	public void createorupdate(Product obj);
	public void delete(Integer pid);
	public Product getproduct(Integer pid);
	public ArrayList<Product> getproduct();
}

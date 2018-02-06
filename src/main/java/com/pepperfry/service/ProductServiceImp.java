package com.pepperfry.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepperfry.dao.ProductDAO;
import com.pepperfry.model.Product;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public void createorupdate(Product obj)
	{
      // TODO Auto-generated method stub
	  productDAO.createorupdate(obj);
	}

	@Override
	public void delete(Integer pid) 
	{
	  // TODO Auto-generated method stub
	  productDAO.delete(pid);
	}

	@Override
	public Product getproduct(Integer pid) 
	{
		// TODO Auto-generated method stub
		return productDAO.getproduct(pid);
	}

	@Override
	public ArrayList<Product> getproduct() 
	{
		// TODO Auto-generated method stub
		return productDAO.getproduct();
	}

}

package com.pepperfry.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepperfry.dao.CategoryDAO;
import com.pepperfry.model.Category;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private CategoryDAO CategoryDAO;
	
	public void createorupdate(Category obj) {
		// TODO Auto-generated method stub
		CategoryDAO.createorupdate(obj);
	}

	@Override
	public void delete(Integer cid) {
		// TODO Auto-generated method stub
		CategoryDAO.delete(cid);
	}

	@Override
	public Category getcategory(Integer cid) {
		// TODO Auto-generated method stub
		return CategoryDAO.getcategory(cid);
	}

	@Override
	public ArrayList<Category> getcategory() {
		// TODO Auto-generated method stub
		return CategoryDAO.getcategory();
	}

}

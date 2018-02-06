package com.pepperfry.service;

import java.util.ArrayList;
import com.pepperfry.model.Category;

public interface CategoryService {

	public void createorupdate(Category obj);
	public void delete(String cid);
	public Category getcategory(String cid);
	public ArrayList<Category> getcategory();
}

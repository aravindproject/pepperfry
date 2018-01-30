package com.pepperfry.service;

import java.util.ArrayList;
import com.pepperfry.model.Category;

public interface CategoryService {

	public void createorupdate(Category obj);
	public void delete(Integer cid);
	public Category getcategory(Integer cid);
	public ArrayList<Category> getcategory();
}

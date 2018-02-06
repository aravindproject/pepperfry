package com.pepperfry.dao;

import java.util.ArrayList;
import com.pepperfry.model.Category;

public interface CategoryDAO {

	public void createorupdate(Category obj);
	public void delete(Integer cid);
	public Category getcategory(Integer cid);
	public ArrayList<Category> getcategory();
}

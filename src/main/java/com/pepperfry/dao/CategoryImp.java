package com.pepperfry.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pepperfry.model.Category;

@Repository
public class CategoryImp implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void createorupdate(Category obj) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.saveOrUpdate(obj);
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public void delete(Integer cid) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.createQuery("DELETE FROM Category where cid="+cid).executeUpdate();
		tx.commit();
		s.close();
		
	}

	@Override
	@Transactional
	public Category getcategory(Integer cid) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		Category x = s.get(Category.class, cid);
		tx.commit();
		s.close();
		return x;
	}

	@Override
	@Transactional
	public ArrayList<Category> getcategory() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		ArrayList<Category> clist =(ArrayList<Category>) s.createCriteria(Category.class).list();
		tx.commit();
		s.close();
		return clist;
	}

}

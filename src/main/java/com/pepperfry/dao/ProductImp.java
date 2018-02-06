package com.pepperfry.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pepperfry.model.Product;

@EnableTransactionManagement
@Repository("productDAO")
public class ProductImp implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	//initialize
	public ProductImp()
	{
		super();
	}
	public ProductImp(SessionFactory sessionFactory)
	{
		this.sessionFactory= sessionFactory;
	}
	
	@Override
	public void createorupdate(Product obj) 
	{
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx= s.beginTransaction();
		s.saveOrUpdate(obj);
		tx.commit();
		s.close();
	}

	@Override
	public void delete(Integer pid) 
	{
		// TODO Auto-generated method stub
        Session s= sessionFactory.openSession();
        org.hibernate.Transaction tx= s.beginTransaction();
        s.createQuery("DELETE FROM Product where pid='"+pid+"'").executeUpdate();
        tx.commit();
        s.close();
	}

	@Override
	public Product getproduct(Integer pid) 
	{
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
        org.hibernate.Transaction tx= s.beginTransaction();
        Product x= s.get(Product.class, pid);
        tx.commit();
        s.close();
		return x;
	}

	@Override
	public ArrayList<Product> getproduct() 
	{
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
        org.hibernate.Transaction tx= s.beginTransaction();
    	@SuppressWarnings("unchecked")
		ArrayList<Product> plist = (ArrayList<Product>) s.createCriteria(Product.class).list();
        tx.commit();
        s.close();
		return plist;
	}
}

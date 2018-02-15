package com.pepperfry.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pepperfry.model.CartItem;


@Repository
public class CartItemImp implements CartItemDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addCart(CartItem cartItem)
	{
		// TODO Auto-generated method stub
	
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.saveOrUpdate(cartItem);
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public void removeCart(CartItem cartItem)
	{
		// TODO Auto-generated method stub
		
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		s.delete(cartItem);
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public void removeAllCart(CartItem cart)
	{
		// TODO Auto-generated method stub
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<CartItem> cilist= (List<CartItem>) s.createCriteria(CartItem.class).list();
		for(CartItem item: cilist)
		{
			removeCart(item);
		}
		tx.commit();
		s.close();
	}

	@Override
	@Transactional
	public List<CartItem> list() 
	{
		// TODO Auto-generated method stub
		
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		List<CartItem> cilist =(List<CartItem>) s.createCriteria(CartItem.class).list();
		tx.commit();
		s.close();
		return cilist;
	}
}

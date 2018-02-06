package com.pepperfry.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.pepperfry.model.Supplier;

@EnableTransactionManagement
@Transactional
@Repository

public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public void saveSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@Override
	public Supplier getSupplierById(String supplierId) {
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		Supplier x = s.get(Supplier.class, supplierId);
		tx.commit();
		s.close();
		return x;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public ArrayList<Supplier> getAllSuppliers() {
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();

		ArrayList<Supplier> slist = (ArrayList<Supplier>) s.createCriteria(Supplier.class).list();
		System.out.println(slist);
		tx.commit();
		s.close();
		return slist;
	}

	@Override
	@Transactional
	public void deleteSupplier(String supplierId) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();

		s.createQuery("DELETE FROM Supplier where supplierId='" + supplierId + "'").executeUpdate();
		tx.commit();
		s.close();
	}

}

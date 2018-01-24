package com.pepperfry.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pepperfry.model.Supplier;

@EnableTransactionManagement
@Repository

public class SupplierDAOImpl implements SupplierDAO{

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public void saveSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@Override
	public Supplier getSupplierById(int supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
	}

}

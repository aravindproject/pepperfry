package com.pepperfry.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepperfry.dao.SupplierDAO;
import com.pepperfry.model.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	public SupplierDAO supplierDAO;
	
	@Override
	public void saveSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		supplierDAO.saveSupplier(obj);
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

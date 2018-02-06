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
	public ArrayList<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return supplierDAO.getAllSuppliers();
	}

	 

	@Override
	public Supplier getSupplierById(String supplierId) {
		// TODO Auto-generated method stub
		return supplierDAO.getSupplierById(supplierId);
	}

	@Override
	public void deleteSupplier(String supplierId) {
		// TODO Auto-generated method stub
		supplierDAO.deleteSupplier(supplierId);
	}

	 

 

	 

}

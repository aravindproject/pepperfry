package com.pepperfry.dao;

import java.util.ArrayList;
 

import com.pepperfry.model.Supplier;

public interface SupplierDAO {

	public void saveSupplier(Supplier obj);
	public Supplier getSupplierById( String supplierId);
	public ArrayList<Supplier> getAllSuppliers();
	public void deleteSupplier(String supplierId);
	
}

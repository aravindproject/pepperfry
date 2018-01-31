package com.pepperfry.service;

import java.util.ArrayList;

import com.pepperfry.model.Supplier;

public interface SupplierService {
	public void saveSupplier(Supplier obj);

	public Supplier getSupplierById(String supplierId);

	public ArrayList<Supplier> getAllSuppliers();

	public void deleteSupplier(String supplierId);

	public Object getsupplier();

	void deleteSupplier(int supplierId);

}

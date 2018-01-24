package com.pepperfry.service;

import java.util.ArrayList;

import com.pepperfry.model.Supplier;

public interface SupplierService {
	public void saveSupplier(Supplier obj);

	public Supplier getSupplierById(int supplierId);

	public ArrayList<Supplier> getAllSuppliers();

	public void deleteSupplier(int supplierId);

}

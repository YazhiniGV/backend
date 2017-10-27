
package com.niit.DAO;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {
	
	public void save(Supplier supplier);
	public void update(Supplier supplier);
	public void delete(int supplierId);
	public Supplier getbyId(int supplierId);
	public List<Supplier> list();
	
}

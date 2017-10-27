package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	
	public void save(Product product);
	public void update(Product product);
	public void delete(int productId);
	public Product getbyId(int productId);
	public List<Product> list();
	
}

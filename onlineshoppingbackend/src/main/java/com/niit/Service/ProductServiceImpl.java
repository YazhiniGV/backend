package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {
	
    @Autowired
    private ProductDAO productDAO;

	public void save(Product product) {
		
		productDAO.save(product);
		
	}

    public void update(Product product) {
    	
    	productDAO.update(product);
      
    }

    public void delete(int ProductId) {
        
    	productDAO.delete(ProductId);

    }

	public Product getbyId(int ProductId) {
		
		productDAO.getbyId(ProductId);
		
		return null;
	}
    public List<Product> list() {
        
    	  
        return null;
    }

	

}
package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;
    
    public void saveCategory(Category category) {
        
        categoryDAO.saveCategory(category);
    }

    public void update(Category category) {
    	
    	categoryDAO.update(category);
      
    }

    public void delete(int categoryId) {
        
    	categoryDAO.delete(categoryId);

    }

    public Category getById(int categoryId) {
        
    	categoryDAO.getbyId(categoryId);
    	
        return null;
    }

    public List<Category> list() {
        
  
        return null;
    }

}
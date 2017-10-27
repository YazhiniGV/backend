package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

@Service
@Transactional

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    
    public void save(User user) {
        
    	userDAO.save(user);
    }

    public void update(User user) {
    	
    	userDAO.update(user);
      
    }

    public void delete(int userId) {
        
    	userDAO.delete(userId);

    }

	public User getbyId(int userId) {
		
		userDAO.getbyId(userId);
		
		return null;
	}
    public List<User> list() {
        
    	  
        return null;
    }

}
package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CartDAO;
import com.niit.model.Cart;

@Service
@Transactional

public class CartServiceImpl implements CartService {

    @Autowired
    private CartDAO cartDAO;
    
    public void saveCart(Cart cart) {
        
        cartDAO.saveCart(cart);
    }

    public void update(Cart cart) {
    	
    	cartDAO.update(cart);
      
    }

    public void delete(int cartId) {
        
    	cartDAO.delete(cartId);

    }

	public Cart getbyId(int cartId) {
		
		cartDAO.getbyId(cartId);
		
		return null;
	}
    public List<Cart> list() {
        
    	  
        return null;
    }

}
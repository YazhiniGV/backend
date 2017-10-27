package com.niit.Service;

import java.util.List;

import com.niit.model.Cart;

public interface CartService{
	
	public void saveCart(Cart cart);
	public void update(Cart cart);
	public void delete(int cartId);
	public Cart getbyId(int cartId);
	public List<Cart> list();
	
}

package com.niit.DAO;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	
	public void save(User user);
	public void update(User user);
	public void delete(int userId);
	public User getbyId(int userId);
	public List<User> list();
	
}

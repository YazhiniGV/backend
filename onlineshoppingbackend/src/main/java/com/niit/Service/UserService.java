package com.niit.Service;

import java.util.List;

import com.niit.model.User;

public interface UserService {

	public void save(User user);
	public void update(User user);
	public void delete(int userId);
	public User getbyId(int userId);
	public List<User> list();
	
}


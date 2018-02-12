package com.pepperfry.dao;

import java.util.List;
import com.pepperfry.model.User;


public interface UserDAO {
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public boolean isValidUser(String username,String password);
	public User getuser(String username);
	public List<User> list();
}

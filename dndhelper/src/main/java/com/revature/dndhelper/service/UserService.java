package com.revature.dndhelper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.User;
import com.revature.dndhelper.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public User getUserByEmail(String email) {
		return dao.getUserByEmail(email);
	}
	
	@Transactional
	public Boolean userExists(String email) {
		return dao.userExists(email);
	}
	
	@Transactional
	public void saveUser(String email, String password) {
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		dao.saveUser(user);
	}
	
	@Transactional
	public void saveUser(User user) {
		dao.saveUser(user);
	}
}

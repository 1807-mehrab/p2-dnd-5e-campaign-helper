package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.User;

@Repository
public class UserDao{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sF) {
		sessionFactory = sF;
	}
	
	public User getUserByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();
		List<User> account = new ArrayList<User>();
		account = session.createQuery("from User_Accounts where email = :nameVar")
				.setString("nameVar", email).list();
		if(account.isEmpty()) {
			return null;
		}
		return account.get(0);
	}
	
	public int saveUser(User user) {
		Session s = sessionFactory.getCurrentSession();
		try {
			return (int) s.save(user);
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
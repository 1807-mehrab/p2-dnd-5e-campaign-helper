package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.UserAccount;

@Repository
public class UserDao{
	private SessionFactory sessionFactory;
	public void setSF(SessionFactory sF) {
		sessionFactory = sF;
	}
	public List<UserAccount> getUserAccount(String email){
		Session session = sessionFactory.getCurrentSession();
		List<UserAccount> accounts = new ArrayList<UserAccount>();
		accounts= session.createQuery("from User_Accounts where email = :nameVar")
				.setString("nameVar", email).list();
		return accounts;
	}
}
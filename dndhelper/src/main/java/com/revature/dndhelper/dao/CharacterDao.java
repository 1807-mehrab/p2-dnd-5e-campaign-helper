package com.revature.dndhelper.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Character> getAllCharacters() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Character").list();
	}
	
	public List<Character> getCharactersByuserId(String userId) {
		Session s = sessionFactory.getCurrentSession();
		List<Character> result = s.createQuery("from Character where user_id= :userId").
				setString("userId", userId).list();
	
		return result;
	}
	
	public int saveCharacter(Character c) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = (int) s.save(c);
		tx.commit();
		return result;
	}
}

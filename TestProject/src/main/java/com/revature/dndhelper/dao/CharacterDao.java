package com.revature.dndhelper.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.revature.dndhelper.beans.CharacterSkills;
import com.revature.dndhelper.beans.DNDCharacter;

@Repository
public class CharacterDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<DNDCharacter> getAllCharacters() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from DNDCharacter").list();
	}
	
	public List<DNDCharacter> getCharactersByUserEmail(String userEmail) {
		Session s = sessionFactory.getCurrentSession();
		List<DNDCharacter> result = s.createQuery("from DNDCharacter where email= :userEmail").
				setString("userEmail", userEmail).list();
	
		return result;
	}
	
	
	
	public int saveCharacter(DNDCharacter c) {
		Session s = sessionFactory.getCurrentSession();
		try {
			return Integer.parseInt((String)s.save(c));
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
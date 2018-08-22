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
		return s.createQuery("from Character").list();
	}
	
	public List<DNDCharacter> getCharactersByUserEmail(String email) {
		Session s = sessionFactory.getCurrentSession();
		List<DNDCharacter> result = s.createQuery("from DNDCharacter where email= :email").
				setString("email", email).list();
		return result;
	}
	
	public DNDCharacter getCharacterByCharId(int charId) {
		Session s = sessionFactory.getCurrentSession();
		List<DNDCharacter> result = s.createQuery("from DNDCharacter where char_id= :charId").
				setInteger("charId", charId).list();
		if(result.isEmpty()) {
			return null;
		}
		
		return result.get(0);
	}
	
	public int cloneCharacter(DNDCharacter c, String userEmail) {
		Session s = sessionFactory.getCurrentSession();
		c.setUserEmail(userEmail);
		Transaction tx = s.beginTransaction();
		int result = (int) s.save(c);
		tx.commit();
		return result;
	}
	
	public int saveCharacter(DNDCharacter c) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = (int) s.save(c);
		tx.commit();
		return result;
	}
	
	
}

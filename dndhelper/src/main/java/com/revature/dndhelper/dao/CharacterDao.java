package com.revature.dndhelper.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.revature.dndhelper.beans.CharacterSkills;

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
	
	public List<Character> getCharactersByUserId(String userId) {
		Session s = sessionFactory.getCurrentSession();
		List<Character> result = s.createQuery("from Character where user_id= :userId").
				setString("userId", userId).list();
	
		return result;
	}
	
	public HashMap<String, Boolean> getCharacterSkillsByCharacterId(int charId) {
		Session s = sessionFactory.getCurrentSession();
		List<CharacterSkills> result = s.createQuery("from CharacterSkills where char_id= :charId").
				setInteger("charId", charId).list();
		
		if(result.isEmpty()) {
			return null; // charId is not in table 
		}
		CharacterSkills skills = result.get(0); // there will only be one skill row retrieved
		// finish this by returning characterSkills as some sort of ordered iterable Collection
		
	}
	
	public int saveCharacter(Character c) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = (int) s.save(c);
		tx.commit();
		return result;
	}
	
	
}

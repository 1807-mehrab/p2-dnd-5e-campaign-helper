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
	
	public List<DNDCharacter> getCharacterByContents(String email, String name, String cclass, String race, String bg, String align) {
		Session s = sessionFactory.getCurrentSession();
		List<DNDCharacter> result = s.createQuery("from DNDCharacter where email= :userEmail and char_name= :name and char_class= :class and char_race= :race and char_background= :bg and char_alignment= :align").
				setString("userEmail", email)
				.setString("name", name)
				.setString("class", cclass)
				.setString("race", race)
				.setString("bg", bg)
				.setString("align", align).
				list();
		
		
		
		return result;
	}
	
	public void saveCharacter(DNDCharacter c) {
		Session s = sessionFactory.getCurrentSession();
		try {
			 s.save(c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

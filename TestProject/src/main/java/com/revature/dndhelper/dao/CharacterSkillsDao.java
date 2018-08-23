package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterSkills;

@Repository
public class CharacterSkillsDao{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sF) {
		sessionFactory = sF;
	}
	
	public CharacterSkills getCharacterSkillsByCharId(int charId){
		Session session = sessionFactory.getCurrentSession();
		List<CharacterSkills> skills = new ArrayList<CharacterSkills>();
		skills = session.createQuery("from CharacterSkills where charId = :charId")
				.setInteger("charId", charId).list();
		
		if(skills.isEmpty()) {
			return null; // if it is empty, the charId was not found
		}
		return skills.get(0);
	}
	
	public int saveCharacterSkills(CharacterSkills cSkill) {
		Session s = sessionFactory.getCurrentSession();
		try {
			return Integer.parseInt((String)s.save(cSkill));
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public void updateCharacterSkills(CharacterSkills cSkill) {
		Session s = sessionFactory.getCurrentSession();
		try {
			s.update(cSkill);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
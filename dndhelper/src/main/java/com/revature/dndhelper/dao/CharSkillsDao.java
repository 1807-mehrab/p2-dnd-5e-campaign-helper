package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterSkills;

@Transactional
public class CharSkillsDao{
	private SessionFactory sessionFactory;
	public void setSF(SessionFactory sF) {
		sessionFactory = sF;
	}
	public List<CharacterSkills> getUserCharStats(int charId){
		Session session = sessionFactory.getCurrentSession();
		List<CharacterSkills> accounts = new ArrayList<CharacterSkills>();
		accounts= session.createQuery("from Characters_Skills where char_id = :nameVar")
				.setInteger("nameVar", charId).list();
		return accounts;
	}
	public int saveCharStats(CharacterSkills cSkill) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = Integer.parseInt((String)s.save(cSkill));
		tx.commit();
		return result;
	}
}
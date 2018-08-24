package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterStats;

@Repository
public class CharacterStatsDao{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sF) {
		sessionFactory = sF;
	}
	
	@Transactional
	public CharacterStats getCharacterStatsByCharId(int charId){
		Session session = sessionFactory.getCurrentSession();
		List<CharacterStats> accounts = new ArrayList<CharacterStats>();
		accounts= session.createQuery("from CharacterStats where char_id = :nameVar")
				.setInteger("nameVar", charId).list();
		return accounts.get(0);
	}
	
	@Transactional
	public int saveCharacterStats(CharacterStats cStats) {
		Session s = sessionFactory.getCurrentSession();
		try {
			return (int) s.save(cStats);
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@Transactional
	public void updateCharacterStats(CharacterStats cStats) {
		Session s = sessionFactory.getCurrentSession();
		try {
			s.update(cStats);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
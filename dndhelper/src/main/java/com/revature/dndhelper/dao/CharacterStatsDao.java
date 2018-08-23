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
	public List<CharacterStats> getCharacterStatsByUserId(int charId){
		Session session = sessionFactory.getCurrentSession();
		List<CharacterStats> accounts = new ArrayList<CharacterStats>();
		accounts= session.createQuery("from Characters_Stats where char_id = :nameVar")
				.setInteger("nameVar", charId).list();
		return accounts;
	}
	public int saveCharacterStats(CharacterStats cStat) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = Integer.parseInt((String)s.save(cStat));
		tx.commit();
		return result;
	}
}
package com.revature.dndhelper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterStats;

@Transactional
public class CharStatsDao{
	private SessionFactory sessionFactory;
	public void setSF(SessionFactory sF) {
		sessionFactory = sF;
	}
	public List<CharacterStats> getUserCharStats(int charId){
		Session session = sessionFactory.getCurrentSession();
		List<CharacterStats> accounts = new ArrayList<CharacterStats>();
		accounts= session.createQuery("from Characters_Stats where char_id = :nameVar")
				.setInteger("nameVar", charId).list();
		return accounts;
	}
	public int saveCharStats(CharacterStats cStat) {
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		int result = Integer.parseInt((String)s.save(cStat));
		tx.commit();
		return result;
	}
}
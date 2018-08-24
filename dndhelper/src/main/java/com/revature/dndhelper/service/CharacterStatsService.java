package com.revature.dndhelper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterStats;
import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.dao.CharacterStatsDao;

@Service
public class CharacterStatsService {

	@Autowired 
	CharacterStatsDao dao;
	
	public void setDao(CharacterStatsDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public CharacterStats getCharacterStatsByCharId(int charId) {
		return dao.getCharacterStatsByCharId(charId);
	}
	
	@Transactional
	public void saveCharacterStats(CharacterStats cStats) throws Exception {
		dao.saveCharacterStats(cStats);
	}
	
	@Transactional
	public void updateCharacterStats(CharacterStats cStats) throws Exception {
		dao.updateCharacterStats(cStats);
	}
	
	
}

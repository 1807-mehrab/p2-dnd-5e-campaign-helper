package com.revature.dndhelper.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.dao.CharacterStatsDao;

public class CharacterStatsService {

	@Autowired 
	CharacterStatsDao dao;
	
	public void setDao(CharacterStatsDao dao) {
		this.dao = dao;
	}
	
	public void getCharacterStatsByUserId(int userId) {
		
	}
}

package com.revature.dndhelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.dao.CharacterSkillsDao;

public class CharacterSkillsService {

	@Autowired
	CharacterSkillsDao dao;
	
	public void setDao(CharacterSkillsDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public List<DNDCharacter> getAllCharacters() {
		return dao.getAllCharacters();
	}
}

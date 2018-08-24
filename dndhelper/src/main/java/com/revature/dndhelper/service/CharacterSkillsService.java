package com.revature.dndhelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.CharacterSkills;
import com.revature.dndhelper.dao.CharacterSkillsDao;

@Service
public class CharacterSkillsService {

	@Autowired
	CharacterSkillsDao dao;
	
	public void setDao(CharacterSkillsDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public CharacterSkills getCharacterSkillsByCharId(int charId) {
		return dao.getCharacterSkillsByCharId(charId);
	}
	
	@Transactional
	public void saveCharacterSkills(CharacterSkills cSkill) throws Exception {
		dao.saveCharacterSkills(cSkill);
	}
	
	@Transactional
	public void updateCharacterSkills(CharacterSkills cSkill) throws Exception {
		dao.updateCharacterSkills(cSkill);
	}
}

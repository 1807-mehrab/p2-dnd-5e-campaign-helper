package com.revature.dndhelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.dao.CharacterDao;

@Service
public class CharacterService {
	
	@Autowired
	CharacterDao dao;
	
	public void setDao(CharacterDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public List<Character> getAllCharacters() {
		return dao.getAllCharacters();
	}
}

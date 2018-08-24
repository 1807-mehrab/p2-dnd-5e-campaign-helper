package com.revature.dndhelper.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.dao.CharacterDao;

@Service
public class CharacterService {
	
	@Autowired
	CharacterDao dao;
	
	public void setDao(CharacterDao dao) {
		this.dao = dao;
	}
	
	@Transactional
	public List<DNDCharacter> getAllCharacters() {
		return dao.getAllCharacters();
	}
	
	@Transactional
	public List<DNDCharacter> getCharactersByUserEmail(String userEmail) {
		return dao.getCharactersByUserEmail(userEmail);
	}
	
	@Transactional 
	public void saveCharacter(String userEmail, String charName, String charClass, String charRace, String charBackground, String charAlignment) {
		DNDCharacter c = new DNDCharacter();
		c.setUserEmail(userEmail);
		c.setCharName(charName);
		c.setCharClass(charClass);
		c.setCharRace(charRace);
		c.setCharBackground(charBackground);
		c.setCharAlignment(charAlignment);
		
		dao.saveCharacter(c);
	}
	
	@Transactional
	public DNDCharacter getCharacterByContents(DNDCharacter c) {
		String userEmail = c.getUserEmail();
		String charName = c.getCharName();
		String charClass = c.getCharClass();
		String charRace = c.getCharRace();
		String charBackground = c.getCharBackground();
		String charAlignment = c.getCharAlignment();
		ArrayList<DNDCharacter> result = (ArrayList) dao.getCharacterByContents(userEmail, charName, charClass, charRace, charBackground, charAlignment);
		
		if(!result.isEmpty()) {
			return result.get(0);
		}
		
		return null;
	}
	@Transactional
	public void saveCharacter(DNDCharacter DNDchar) {
		try {
		dao.saveCharacter(DNDchar);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

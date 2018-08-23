package com.revature.dndhelper.controllers;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HttpServletBean;
import com.revature.dndhelper.beans.CharacterStats;
import com.revature.dndhelper.HibernateConfig.HibernateConfiguration;
import com.revature.dndhelper.beans.CharacterSkills;
import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.service.*;

public class CharacterSheetController{
	
	/*@RequestMapping(value = "/characterSheet", method = RequestMethod.POST)
	public void assignStats(@PathVariable("charStats") CharacterStats charStats,
				@PathVariable("character") DNDCharacter character,
				@PathVariable("charSkills") CharacterSkills charSkills) {
		//setting base HP according to chosen class
		if(character.getCharClass().equals("Barbarian"))charStats.setHP(12);
		else if(character.getCharClass().equals("Bard"))charStats.setHP(8);
		else if(character.getCharClass().equals("Cleric"))charStats.setHP(8);
		else if(character.getCharClass().equals("Druid"))charStats.setHP(8);
		else if(character.getCharClass().equals("Fighter"))charStats.setHP(10);
		else if(character.getCharClass().equals("Monk"))charStats.setHP(8);
		else if(character.getCharClass().equals("Paladin"))charStats.setHP(10);
		else if(character.getCharClass().equals("Ranger"))charStats.setHP(10);
		else if(character.getCharClass().equals("Rogue"))charStats.setHP(8);
		else if(character.getCharClass().equals("Sorcerer"))charStats.setHP(6);
		else if(character.getCharClass().equals("Warlock"))charStats.setHP(8);
		else if(character.getCharClass().equals("Wizard"))charStats.setHP(6);
		
		//modify character stats based on selected race
		if(character.getCharRace().equals("Hill Dwarf")) {
			charStats.setCon(2 + charStats.getCon());
			charStats.setWis(1 + charStats.getWis());
			charStats.setHP(1 + charStats.getHP());
		}
		else if(character.getCharRace().equals("Mountain Dwarf")) {
			charStats.setCon(2 + charStats.getCon());
			charStats.setStr(2 + charStats.getStr());
		}
		else if(character.getCharRace().equals("High Elf")) {
			charStats.setDex(2 + charStats.getDex());
			charStats.setIntel(1 + charStats.getIntel());
		}
		else if(character.getCharRace().equals("Wood Elf")) {
			charStats.setDex(2 + charStats.getDex());
			charStats.setWis(1 + charStats.getWis());
		}
		else if(character.getCharRace().equals("Lightfoot Halfling")) {
			charStats.setDex(2 + charStats.getDex());
			charStats.setChr(1 + charStats.getChr());
		}
		else if(character.getCharRace().equals("Stout Halfling")) {
			charStats.setCon(1 + charStats.getCon());
			charStats.setDex(2 + charStats.getDex());
		}
		else if(character.getCharRace().equals("Human")) {
			charStats.setCon(1 + charStats.getCon());
			charStats.setStr(1 + charStats.getStr());
			charStats.setIntel(1 + charStats.getIntel());
			charStats.setChr(1 + charStats.getChr());
			charStats.setWis(1 + charStats.getWis());
			charStats.setDex(1 + charStats.getDex());
		}
		else if(character.getCharRace().equals("Dragonborn")) {
			charStats.setChr(1 + charStats.getChr());
			charStats.setStr(2 + charStats.getStr());
		}
		else if(character.getCharRace().equals("Forest Gnome")) {
			charStats.setIntel(2 + charStats.getIntel());
			charStats.setDex(1 + charStats.getDex());
		}
		else if(character.getCharRace().equals("Rock Gnome")) {
			charStats.setCon(1 + charStats.getCon());
			charStats.setIntel(2 + charStats.getIntel());
		}
		else if(character.getCharRace().equals("Half-Orc")) {
			charStats.setCon(1 + charStats.getCon());
			charStats.setStr(2 + charStats.getStr());
		}
		else if(character.getCharRace().equals("Tiefling")) {
			charStats.setIntel(1 + charStats.getIntel());
			charStats.setChr(2 + charStats.getChr());
		}
		
		//Set Speed based on race 
		if(character.getCharClass().equals("Hill Dwarf") || character.getCharClass().equals("Mountain Dwarf") || character.getCharClass().equals("Lightfoot Halfling") || character.getCharClass().equals("Stout Halfling") || character.getCharClass().equals("Forest Gnome") || character.getCharClass().equals("Rock Gnome"))charStats.setSpeed(25);
		else if(character.getCharClass().equals("Wood Elf"))charStats.setSpeed(35);
		else charStats.setSpeed(30);
		
		//Modify HP based on final constitution value
		charStats.setHP(charStats.getHP() + (charStats.getCon()-10)/2);
	
		//Create service objects and send all the objects to the database to insert a new character
		CharacterService cs = new CharacterService();
		CharacterStatsService cStats = new CharacterStatsService();
		CharacterSkillsService cSkills = new CharacterSkillsService();
		cs.saveCharacter(character);
		cStats.saveCharacterStats(charStats);
		cSkills.saveCharacterSkills(charSkills);
	}*/
	public void finishCharacter(DNDCharacter character,CharacterStats charStats,CharacterSkills charSkills) {
	
		
		//setting base HP according to chosen class
			if(character.getCharClass().equals("Barbarian"))charStats.setHP(12);
			else if(character.getCharClass().equals("Bard"))charStats.setHP(8);
			else if(character.getCharClass().equals("Cleric"))charStats.setHP(8);
			else if(character.getCharClass().equals("Druid"))charStats.setHP(8);
			else if(character.getCharClass().equals("Fighter"))charStats.setHP(10);
			else if(character.getCharClass().equals("Monk"))charStats.setHP(8);
			else if(character.getCharClass().equals("Paladin"))charStats.setHP(10);
			else if(character.getCharClass().equals("Ranger"))charStats.setHP(10);
			else if(character.getCharClass().equals("Rogue"))charStats.setHP(8);
			else if(character.getCharClass().equals("Sorcerer"))charStats.setHP(6);
			else if(character.getCharClass().equals("Warlock"))charStats.setHP(8);
			else if(character.getCharClass().equals("Wizard"))charStats.setHP(6);
			
			//modify character stats based on selected race
			if(character.getCharRace().equals("Hill Dwarf")) {
				charStats.setCon(2 + charStats.getCon());
				charStats.setWis(1 + charStats.getWis());
				charStats.setHP(1 + charStats.getHP());
			}
			else if(character.getCharRace().equals("Mountain Dwarf")) {
				charStats.setCon(2 + charStats.getCon());
				charStats.setStr(2 + charStats.getStr());
			}
			else if(character.getCharRace().equals("High Elf")) {
				charStats.setDex(2 + charStats.getDex());
				charStats.setIntel(1 + charStats.getIntel());
			}
			else if(character.getCharRace().equals("Wood Elf")) {
				charStats.setDex(2 + charStats.getDex());
				charStats.setWis(1 + charStats.getWis());
			}
			else if(character.getCharRace().equals("Lightfoot Halfling")) {
				charStats.setDex(2 + charStats.getDex());
				charStats.setChr(1 + charStats.getChr());
			}
			else if(character.getCharRace().equals("Stout Halfling")) {
				charStats.setCon(1 + charStats.getCon());
				charStats.setDex(2 + charStats.getDex());
			}
			else if(character.getCharRace().equals("Human")) {
				charStats.setCon(1 + charStats.getCon());
				charStats.setStr(1 + charStats.getStr());
				charStats.setIntel(1 + charStats.getIntel());
				charStats.setChr(1 + charStats.getChr());
				charStats.setWis(1 + charStats.getWis());
				charStats.setDex(1 + charStats.getDex());
			}
			else if(character.getCharRace().equals("Dragonborn")) {
				charStats.setChr(1 + charStats.getChr());
				charStats.setStr(2 + charStats.getStr());
			}
			else if(character.getCharRace().equals("Forest Gnome")) {
				charStats.setIntel(2 + charStats.getIntel());
				charStats.setDex(1 + charStats.getDex());
			}
			else if(character.getCharRace().equals("Rock Gnome")) {
				charStats.setCon(1 + charStats.getCon());
				charStats.setIntel(2 + charStats.getIntel());
			}
			else if(character.getCharRace().equals("Half-Orc")) {
				charStats.setCon(1 + charStats.getCon());
				charStats.setStr(2 + charStats.getStr());
			}
			else if(character.getCharRace().equals("Tiefling")) {
				charStats.setIntel(1 + charStats.getIntel());
				charStats.setChr(2 + charStats.getChr());
			}
			
			//Set Speed based on race 
			if(character.getCharClass().equals("Hill Dwarf") || character.getCharClass().equals("Mountain Dwarf") || character.getCharClass().equals("Lightfoot Halfling") || character.getCharClass().equals("Stout Halfling") || character.getCharClass().equals("Forest Gnome") || character.getCharClass().equals("Rock Gnome"))charStats.setSpeed(25);
			else if(character.getCharClass().equals("Wood Elf"))charStats.setSpeed(35);
			else charStats.setSpeed(30);
			
			//Modify HP based on final constitution value
			charStats.setHP(charStats.getHP() + (charStats.getCon()-10)/2);
		
			//Create service objects and send all the objects to the database to insert a new character
			CharacterService cs = new CharacterService();
			CharacterStatsService cStats = new CharacterStatsService();
			CharacterSkillsService cSkills = new CharacterSkillsService();
			cs.saveCharacter(character);
			cStats.saveCharacterStats(charStats);
			cSkills.saveCharacterSkills(charSkills);
		}
}
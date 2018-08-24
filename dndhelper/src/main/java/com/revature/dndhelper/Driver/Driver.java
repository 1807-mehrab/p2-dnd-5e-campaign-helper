package com.revature.dndhelper.Driver;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.dndhelper.HibernateConfig.HibernateConfiguration;
import com.revature.dndhelper.beans.CharacterSkills;
import com.revature.dndhelper.beans.CharacterStats;
import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.controllers.CharacterSheetController;
import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.service.CharacterService;
import com.revature.dndhelper.service.CharacterSkillsService;
import com.revature.dndhelper.service.CharacterStatsService;
import com.revature.dndhelper.service.UserService;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		CharacterService characterService = context.getBean("characterService", CharacterService.class);
		CharacterSkillsService characterSkillsService = context.getBean("characterSkillsService", CharacterSkillsService.class);
		CharacterStatsService characterStatsService = context.getBean("characterStatsService", CharacterStatsService.class);
		UserService userService = context.getBean("userService", UserService.class);
		
		String userEmail = "mail@email.com";
		String userPassword = "somepassword";

		System.out.println("\n" + userEmail + " exists: " + userService.userExists(userEmail) + "\n");
		try {
			if(!userService.userExists(userEmail)) {
				userService.saveUser(userEmail, userPassword);
				System.out.println("Saved User");
			}
			else {
				System.out.println("Cannot save user.");
			}
		} catch (Exception e) {
			
		}
		
		System.out.println("\n" + userEmail + " exists: " + userService.userExists(userEmail) + "\n");
		System.out.println("\n" + "user: " + userService.getUserByEmail(userEmail) + "\n");
		
		
		//simulated character creation
		DNDCharacter c = new DNDCharacter();
		c.setUserEmail(userEmail);
		c.setCharName("Druid guy");
		c.setCharClass("Druid");
		c.setCharRace("Human");
		c.setCharBackground("Sage");
		c.setCharAlignment("Chaotic Evil");
		
		characterService.saveCharacter(c);
		
		c = characterService.getCharacterByContents(c);
		// simulated stat entry 
		CharacterStats stats = new CharacterStats();
		stats.setChr(0);
		stats.setCon(0);
		stats.setDex(0);
		stats.setHP(0);
		stats.setId(0);
		stats.setIntel(0);
		stats.setSpeed(0);
		stats.setStr(0);
		stats.setWis(0);
		
		stats = DriverHelper.finishStats(c, stats);
		
		try {
			characterStatsService.saveCharacterStats(stats);
		} catch (Exception e) {
			
		}
		
		stats = characterStatsService.getCharacterStatsByCharId(c.getCharId());
		System.out.println("\nstats: " + stats + "\n");
		// simulated skills assignment
		CharacterSkills skills = new CharacterSkills();
		skills.setAcrobatics("F");
		skills.setAnimalHandling("F");
		skills.setArcana("F");
		skills.setAthletics("F");
		skills.setDeception("F");
		skills.setHistory("F");
		skills.setInsight("F");
		skills.setIntimidation("F");
		skills.setInvestigation("F");
		skills.setMedicine("F");
		skills.setNature("F");
		skills.setPerception("F");
		skills.setPerformance("F");
		skills.setPersuasion("F");
		skills.setReligion("F");
		skills.setSoh("F");
		skills.setSurvival("F");
		
		skills.setId(c.getCharId());
		
		try {
			characterSkillsService.saveCharacterSkills(skills);
		} catch (Exception e) {
			
		}
		
		CharacterSkills cskills = characterSkillsService.getCharacterSkillsByCharId(c.getCharId());
		System.out.println("\nskills: " + cskills + "\n");
		List<DNDCharacter> list = characterService.getCharactersByUserEmail(userEmail);
		System.out.println(list);
		
		
		
		
		
		context.close();
	}

}

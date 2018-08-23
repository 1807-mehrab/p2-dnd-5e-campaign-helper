package com.revature.dndhelper.Driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.dndhelper.HibernateConfig.HibernateConfiguration;
import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.service.CharacterService;
import com.revature.dndhelper.service.CharacterSkillsService;
import com.revature.dndhelper.service.CharacterStatsService;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		CharacterService characterService = context.getBean("characterService", CharacterService.class);
		CharacterSkillsService characterSkillsService = context.getBean("characterSkillsService", CharacterSkillsService.class);
		CharacterStatsService characterStatsService = context.getBean("characterStatsService", CharacterStatsService.class);
		
		String userEmail = "IAmGMMan@420blazeit.com";
		String charName = "blaze";
		String charClass = "wizard";
		String charRace = "stoner";
		String charBackground = "botanist";
		String charAlignment = "league of dab";
		
		//List<DNDCharacter> list = characterService.getAllCharacters();
		//System.out.println(list);
		characterService.saveCharacter(userEmail, charName, charClass, charRace, charBackground, charAlignment);
		
		context.close();
	}

}

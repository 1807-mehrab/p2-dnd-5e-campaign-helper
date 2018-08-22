package com.revature.dndhelper.Driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.dndhelper.HibernateConfig.HibernateConfiguration;
import com.revature.dndhelper.beans.DNDCharacter;
import com.revature.dndhelper.dao.CharacterDao;
import com.revature.dndhelper.service.CharacterService;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		CharacterService characterService = context.getBean("characterService", CharacterService.class);
		
		List<DNDCharacter> list = characterService.getAllCharacters();
		System.out.println(list);
		context.close();
	}

}

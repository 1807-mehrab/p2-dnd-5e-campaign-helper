package com.revature.TestProject;

import com.revature.dndhelper.beans.*;
import com.revature.dndhelper.controllers.*;
//Testing App to make sure the back end is working properly
public class App 
{
    public static void main( String[] args )
    {
    	CharacterSheetController csc = new CharacterSheetController();
    	DNDCharacter character = new DNDCharacter();
    	CharacterStats cStats = new CharacterStats();
    	CharacterSkills cSkills = new CharacterSkills();
    	
    	// set main character information here
    	character.setCharAlignment("Good");
    	character.setCharBackground("Soldier");
    	character.setCharClass("Cleric");
    	character.setCharName("Parius");
    	character.setCharRace("Human");
    	character.setUserEmail("IAmGMMan@420blazeit.com");
    	
    	//set character stats put in typical stats after the dice rolling
    	//program will then take into account race and class to modify
    	cStats.setChr(9);
    	cStats.setCon(13);
    	cStats.setDex(12);
    	cStats.setIntel(11);
    	cStats.setStr(12);
    	cStats.setWis(15);
    	
    	//Set character skills here set the skills the way they should be
    	//according to race and background
    	cSkills.setAcrobatics("F");
    	cSkills.setAnimalHandling("F");
    	cSkills.setArcana("F");
    	cSkills.setAthletics("T");
    	cSkills.setDeception("F");
    	cSkills.setHistory("T");
    	cSkills.setInsight("F");
    	cSkills.setInsight("F");
    	cSkills.setIntimidation("T");
    	cSkills.setInvestigation("F");
    	cSkills.setMedicine("F");
    	cSkills.setNature("F");
    	cSkills.setPerception("F");
    	cSkills.setPerformance("F");
    	cSkills.setPersuasion("F");
    	cSkills.setReligion("T");
    	cSkills.setSoh("F");
    	cSkills.setStealth("F");
    	cSkills.setSurvival("F");
    	
    	System.out.println("Entering a cleric into database");
    	csc.finishCharacter(character, cStats, cSkills);
    	System.out.println("Cleric has been entered");
    }
}

package com.revature.dndhelper.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="character_main")
public class Character {
	@Id
	@GeneratedValue
	private int charId;
	
	
	private String userEmail;
	
	private String charName;
	
	private String charClass;
	
	private String charRace;
	
	private String charBackground;
	
	public int getCharId() {
		return charId;
	}
	public void setCharId(int charId) {
		this.charId = charId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getCharClass() {
		return charClass;
	}
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
	public String getCharRace() {
		return charRace;
	}
	public void setCharRace(String charRace) {
		this.charRace = charRace;
	}
	public String getCharBackground() {
		return charBackground;
	}
	public void setCharBackground(String charBackground) {
		this.charBackground = charBackground;
	}
	
	

}

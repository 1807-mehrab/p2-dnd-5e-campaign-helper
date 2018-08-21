package com.revature.dndhelper.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Characters_Main")
public class Character {
	
	@Id
	@GeneratedValue
	@Column(name="char_id")
	private int charId;
	
	@Column(name="email")
	private String userEmail;
	
	@Column(name="char_name")
	private String charName;
	
	@Column(name="char_class")
	private String charClass;
	
	@Column(name="char_race")
	private String charRace;
	
	@Column(name="char_background")
	private String charBackground;
	
	@Column(name="char_alignment")
	private String charAlignment;
	
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
	
	@Override
	public String toString() {
		return "Character [charId=" + charId + ", userEmail=" + userEmail + ", charName=" + charName + ", charClass="
				+ charClass + ", charRace=" + charRace + ", charBackground=" + charBackground + ", charAlignment="
				+ charAlignment + "]";
	}

}

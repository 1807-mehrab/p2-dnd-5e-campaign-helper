package com.revature.dndhelper.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Characters_Stats")
public class CharacterStats{
	
	@Id
	@GeneratedValue
	@Column(name = "char_id")
	private int charId;
	
	@Column(name = "strength")
	private int strength;
	
	@Column(name = "dexterity")
	private int dexterity;
	
	@Column(name = "intelligence")
	private int intelligence;
	
	@Column(name = "charisma")
	private int charisma;
	
	@Column(name = "constitution")
	private int constitution;
	
	@Column(name = "wisdom")
	private int wisdom;
	
	@Column(name = "hit_points")
	private int hitPoints;
	
	@Column(name = "speed")
	private int speed;
	
	public void setId(int id) {
		charId = id;
	}
	public void setStr(int str) {
		strength = str;
	}
	public void setCon(int con) {
		constitution = con;
	}
	public void setDex(int dex) {
		dexterity = dex;
	}
	public void setIntel(int intel) {
		intelligence = intel;
	}
	public void setChr(int chr) {
		charisma = chr;
	}
	public void setWis(int wis) {
		wisdom = wis;
	}
	public void setHP(int hP) {
		hitPoints = hP;
	}
	public void setSpeed(int spd) {
		speed = spd;
	}
	public int getStr(){
		return strength;
	}
	public int getCon(){
		return constitution;
	}
	public int getDex(){
		return dexterity;
	}
	public int getIntel(){
		return intelligence;
	}
	public int getChr(){
		return charisma;
	}
	public int getWis(){
		return wisdom;
	}
	public int getId() {
		return charId;
	}
	public int getHP() {
		return hitPoints;
	}
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "CharacterStats [charId=" + charId + ", strength=" + strength + ", dexterity=" + dexterity
				+ ", intelligence=" + intelligence + ", charisma=" + charisma + ", constitution=" + constitution
				+ ", wisdom=" + wisdom + ", hitPoints=" + hitPoints + ", speed=" + speed + "]";
	}
}
package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CharacterStats implements Serializable{
	@Id
	@GeneratedValue
	private int charId;
	
	private int strength;
	private int dexterity;
	private int intelligence;
	private int charisma;
	private int constitution;
	private int wisdom;
	private int hitPoints;
	private int speed;
	
	public CharacterStats(int str,int dex,int con,int in, int wis, int chr,int hP,int spd) {
		strength = str;
		dexterity = dex;
		constitution = con;
		intelligence = in;
		wisdom = wis;
		charisma = chr;
		hitPoints = hP;
		speed = spd;
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
}
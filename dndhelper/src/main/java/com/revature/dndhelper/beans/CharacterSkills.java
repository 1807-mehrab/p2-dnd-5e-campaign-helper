package com.revature.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table
public class CharacterSkills implements Serializable{
	@Id
	@GeneratedValue
	private int charId;
	
	private boolean acrobatics;
	private boolean animalHandling;
	private boolean arcana;
	private boolean athletics;
	private boolean deception;
	private boolean history;
	private boolean insight;
	private boolean intimidation;
	private boolean investigation;
	private boolean medicine;
	private boolean nature;
	private boolean perception;
	private boolean performance;
	private boolean persuasion;
	private boolean religion;
	private boolean soh;
	private boolean stealth;
	private boolean survival;
	
	public int getId() {
		return charId;
	}
	public boolean getAcrobatics() {
		return acrobatics;
	}
	public boolean getAnimalHandling() {
		return animalHandling;
	}
	public boolean getArcana() {
		return arcana;
	}
	public boolean getAthletics() {
		return athletics;
	}
	public boolean getDeception() {
		return deception;
	}
	public boolean getHistory() {
		return history;
	}
	public boolean getInsight() {
		return insight;
	}
	public boolean getIntimidation() {
		return intimidation;
	}
	public boolean getInvestigation() {
		return investigation;
	}
	public boolean getMedicine() {
		return medicine;
	}
	public boolean getNature() {
		return nature;
	}
	public boolean getPerception() {
		return perception;
	}
	public boolean getPerformance() {
		return performance;
	}
	public boolean getPersuasion() {
		return persuasion;
	}
	public boolean getReligion() {
		return religion;
	}
	public boolean getSoh() {
		return soh;
	}
	public boolean getStealth() {
		return stealth;
	}
	public boolean getSurvival() {
		return survival;
	}
	public void setAcrobatics(boolean hasAcro) {
		acrobatics = hasAcro;
	}
	public void setAnimalHandling(boolean hasAH) {
		animalHandling = hasAH;
	}
	public void setArcana(boolean hasArcana) {
		arcana = hasArcana;
	}
	public void setAthletics(boolean hasAth) {
		athletics = hasAth;
	}
	public void setDeception(boolean hasDeception) {
		deception = hasDeception;
	}
	public void setHistory(boolean hasHist) {
		history = hasHist;
	}
	public void setInsight(boolean hasInsight) {
		insight = hasInsight;
	}
	public void setIntimidation(boolean hasIntim) {
		intimidation = hasIntim;
	}
	public void setInvestigation(boolean hasInv) {
		investigation = hasInv;
	}
	public void setMedicine(boolean hasMed) {
		medicine = hasMed;
	}
	public void setNature(boolean hasNat) {
		nature = hasNat;
	}
	public void setPerception(boolean hasPer) {
		perception = hasPer;
	}
	public void setPerformance(boolean hasPerf) {
		performance = hasPerf;
	}
	public void setPersuasion(boolean hasPers) {
		persuasion = hasPers;
	}
	public void setReligion(boolean hasRel) {
		religion = hasRel;
	}
	public void setSoh(boolean hasSoh) {
		soh = hasSoh;
	}
	public void setStealth(boolean hasStealth) {
		stealth = hasStealth;
	}
	public void setSurvival(boolean hasSur) {
		survival = hasSur;
	}
}
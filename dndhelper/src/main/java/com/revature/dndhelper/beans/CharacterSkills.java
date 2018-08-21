package com.revature.dndhelper.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table
public class CharacterSkills implements Serializable{
	@Id
	@Column(name = "char_id")
	private int charId;
	
	@Column(name = "char_acrobatics")
	private boolean acrobatics;
	
	@Column(name = "char_animal_handling")
	private boolean animalHandling;
	
	@Column(name = "char_arcana")
	private boolean arcana;
	
	@Column(name = "char_athletics")
	private boolean athletics;
	
	@Column(name = "char_deception")
	private boolean deception;
	
	@Column(name = "char_history")
	private boolean history;
	
	@Column(name = "char_insight")
	private boolean insight;
	
	@Column(name = "char_intimidation")
	private boolean intimidation;
	
	@Column(name = "char_investigation")
	private boolean investigation;
	
	@Column(name = "char_medicine")
	private boolean medicine;
	
	@Column(name = "char_nature")
	private boolean nature;
	
	@Column(name = "char_perception")
	private boolean perception;
	
	@Column(name = "char_performance")
	private boolean performance;
	
	@Column(name = "char_persuasion")
	private boolean persuasion;
	
	@Column(name = "char_religion")
	private boolean religion;
	
	@Column(name = "char_soh")
	private boolean soh;
	
	@Column(name = "char_stealth")
	private boolean stealth;
	
	@Column(name = "char_survival")
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
	public void setId(int id) {
		charId = id;
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
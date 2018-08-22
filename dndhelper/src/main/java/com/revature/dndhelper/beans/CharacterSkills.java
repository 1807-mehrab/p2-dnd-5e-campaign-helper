package com.revature.dndhelper.beans;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Characters_Skills")
public class CharacterSkills{
	@Id
	@GeneratedValue
	@Column(name = "char_id")
	private int charId;
	
	@Column(name = "char_acrobatics")
	private String acrobatics;
	
	@Column(name = "char_animal_handling")
	private String animalHandling;
	
	@Column(name = "char_arcana")
	private String arcana;
	
	@Column(name = "char_athletics")
	private String athletics;
	
	@Column(name = "char_deception")
	private String deception;
	
	@Column(name = "char_history")
	private String history;
	
	@Column(name = "char_insight")
	private String insight;
	
	@Column(name = "char_intimidation")
	private String intimidation;
	
	@Column(name = "char_investigation")
	private String investigation;
	
	@Column(name = "char_medicine")
	private String medicine;
	
	@Column(name = "char_nature")
	private String nature;
	
	@Column(name = "char_perception")
	private String perception;
	
	@Column(name = "char_performance")
	private String performance;
	
	@Column(name = "char_persuasion")
	private String persuasion;
	
	@Column(name = "char_religion")
	private String religion;
	
	@Column(name = "char_soh")
	private String soh;
	
	@Column(name = "char_stealth")
	private String stealth;
	
	@Column(name = "char_survival")
	private String survival;
	
	//this method builds a hash map and returns it
	public Map<String, String> getHashMap() {
		Map<String, String> skillMap = new HashMap<String,String>();
		skillMap.put("Acrobatics",acrobatics);
		skillMap.put("AnimalHandling",animalHandling );
		skillMap.put("Arcana", arcana);
		skillMap.put("Athletics", athletics);
		skillMap.put("Deception", deception);
		skillMap.put("History", history);
		skillMap.put("Insight", insight);
		skillMap.put("Intimidation", intimidation);
		skillMap.put("Investigation", investigation);
		skillMap.put("Medicine", medicine);
		skillMap.put("Nature", nature);
		skillMap.put("Perception", perception);
		skillMap.put("Performance", performance);
		skillMap.put("Persuation", persuasion);
		skillMap.put("Religion", religion);
		skillMap.put("Soh", soh);
		skillMap.put("Stealth", stealth);
		skillMap.put("Survival", survival);
		return skillMap;
	}
	
	public int getId() {
		return charId;
	}
	public String getAcrobatics() {
		return acrobatics;
	}
	public String getAnimalHandling() {
		return animalHandling;
	}
	public String getArcana() {
		return arcana;
	}
	public String getAthletics() {
		return athletics;
	}
	public String getDeception() {
		return deception;
	}
	public String getHistory() {
		return history;
	}
	public String getInsight() {
		return insight;
	}
	public String getIntimidation() {
		return intimidation;
	}
	public String getInvestigation() {
		return investigation;
	}
	public String getMedicine() {
		return medicine;
	}
	public String getNature() {
		return nature;
	}
	public String getPerception() {
		return perception;
	}
	public String getPerformance() {
		return performance;
	}
	public String getPersuasion() {
		return persuasion;
	}
	public String getReligion() {
		return religion;
	}
	public String getSoh() {
		return soh;
	}
	public String getStealth() {
		return stealth;
	}
	public String getSurvival() {
		return survival;
	}
	public void setId(int id) {
		charId = id;
	}
	public void setAcrobatics(String hasAcro) {
		acrobatics = hasAcro;
	}
	public void setAnimalHandling(String hasAH) {
		animalHandling = hasAH;
	}
	public void setArcana(String hasArcana) {
		arcana = hasArcana;
	}
	public void setAthletics(String hasAth) {
		athletics = hasAth;
	}
	public void setDeception(String hasDeception) {
		deception = hasDeception;
	}
	public void setHistory(String hasHist) {
		history = hasHist;
	}
	public void setInsight(String hasInsight) {
		insight = hasInsight;
	}
	public void setIntimidation(String hasIntim) {
		intimidation = hasIntim;
	}
	public void setInvestigation(String hasInv) {
		investigation = hasInv;
	}
	public void setMedicine(String hasMed) {
		medicine = hasMed;
	}
	public void setNature(String hasNat) {
		nature = hasNat;
	}
	public void setPerception(String hasPer) {
		perception = hasPer;
	}
	public void setPerformance(String hasPerf) {
		performance = hasPerf;
	}
	public void setPersuasion(String hasPers) {
		persuasion = hasPers;
	}
	public void setReligion(String hasRel) {
		religion = hasRel;
	}
	public void setSoh(String hasSoh) {
		soh = hasSoh;
	}
	public void setStealth(String hasStealth) {
		stealth = hasStealth;
	}
	public void setSurvival(String hasSur) {
		survival = hasSur;
	}
	
	@Override
	public String toString() {
		return "CharacterSkills [charId=" + charId + ", acrobatics=" + acrobatics + ", animalHandling=" + animalHandling
				+ ", arcana=" + arcana + ", athletics=" + athletics + ", deception=" + deception + ", history="
				+ history + ", insight=" + insight + ", intimidation=" + intimidation + ", investigation="
				+ investigation + ", medicine=" + medicine + ", nature=" + nature + ", perception=" + perception
				+ ", performance=" + performance + ", persuasion=" + persuasion + ", religion=" + religion + ", soh="
				+ soh + ", stealth=" + stealth + ", survival=" + survival + "]";
	}
}
package com.habilidades.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity

public class Skill {
	
	@GeneratedValue
	@Id
	private int id; 
	private String skill;
	
	@OneToMany(mappedBy="skill")
	private List<Ranking> ranking= new ArrayList<Ranking>();	
	
	
	public Skill() {
		
	}
	public Skill( String skill) {
		super();
		
		this.skill = skill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
	
	public List<Ranking> getRanking() {
		return ranking;
	}
	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", skill=" + skill + "]";
	}
	
	
	
	


}

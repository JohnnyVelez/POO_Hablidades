package com.habilidades.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Ranking {
	@GeneratedValue
	@Id
	private int id;
	private int ranking;
	
	@OneToOne
	private Persona persona; 
	
	@OneToOne
	private Skill skill;
	
	
	public Ranking() {
		
	}
	public Ranking( int ranking) {
		super();
		
		this.ranking = ranking;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
	
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Ranking [id=" + id + ", ranking=" + ranking + "]";
	} 
	
	
	
	

}

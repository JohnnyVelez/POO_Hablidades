package com.habilidades;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.habilidades.entidades.Persona;
import com.habilidades.entidades.Ranking;
import com.habilidades.entidades.Skill;

public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	 static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	 public static void main(String[] args) 
	 {
		 
		 Persona persona1= new Persona("Jose");
		 ingresarPersona(persona1);
		 
		 Ranking ranking1= new Ranking(4);
		 ingresarRanking(ranking1);
		 
		 Skill skill1= new Skill("Programacion en Java");
		 ingresarSkill(skill1);
		 
		// CONSULTA
		 
			//List<Persona> persona= getPersonas();
			//for(Persona temp:persona) {System.out.println(temp);}
		 
		 
		 //List<Ranking> ranking= getRankings();
	    //for(Ranking temp1:ranking) {System.out.println(temp1);}
		 
	     //List<Skill> skill= getSkills();
		 //for(Skill temp2:skill) {System.out.println(temp2);}
		 
	 }
		
		
	 		 
	 
		 
	 




static void ingresarPersona(Persona persona) {
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(persona);
	session.getTransaction().commit();
	session.close();

}


static void ingresarRanking(Ranking ranking) {
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(ranking);
	session.getTransaction().commit();
	session.close();

}


static void ingresarSkill(Skill skill) {
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(skill);
	session.getTransaction().commit();
	session.close();

}

static List<Persona> getPersonas(){
Session session = sessionFactory.openSession();
List<Persona> personas=(List<Persona>)session.createQuery("from Persona",Persona.class ).list();
return personas;
}

static List<Ranking> getRankings(){
Session session = sessionFactory.openSession();
List<Ranking> ranking=(List<Ranking>)session.createQuery("from Ranking",Ranking.class ).list();
return ranking;
}

static List<Skill> getSkills(){
Session session = sessionFactory.openSession();
List<Skill> skills=(List<Skill>)session.createQuery("from Persona",Skill.class ).list();
return skills;
}

}
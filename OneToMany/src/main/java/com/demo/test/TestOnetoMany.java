package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;
public class TestOnetoMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Player p1= new Player(7,"Dhoni",435434,null);
		Player p2= new Player(8,"Jadega",154542,null);
		Player p3= new Player(12,"Pandya",78774,null);
		Player p4= new Player(45,"Rohit sharma",23645,null);
		
		Set<Player> set1=new HashSet<>();
		Set<Player> set2=new HashSet<>();
		
		set1.add(p1);
		set1.add(p2);
		set2.add(p4);
		set2.add(p3);
		
		IPLTeam team1 = new IPLTeam(101,"CSK",set1);
		IPLTeam team2 =new IPLTeam(102,"MI",set2);
		
		p1.setTeam(team1);
		p2.setTeam(team1);
		p3.setTeam(team2);
		p4.setTeam(team2);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(team1);
		session.save(team2);
		
		tr.commit();
		session.close();
		sf.close();
	}

}

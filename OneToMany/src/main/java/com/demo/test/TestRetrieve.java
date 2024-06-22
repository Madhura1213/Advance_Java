package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.IPLTeam;

public class TestRetrieve {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		IPLTeam team=session.get(IPLTeam.class,101);
		System.out.println(team);
		System.out.println(team.getPlayerset());
		tr.commit();
		session.close();
		sf.close();

	}

}

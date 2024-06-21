package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf = new  Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Perishable perishable = session.get(Perishable.class, 12);
		NonPerishable nonperishable =session.get(NonPerishable.class, 13);
		tr.commit();
		System.out.println(perishable);
		System.out.println(nonperishable);
		session.close();
		sf.close();
	}

}

package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;

public class TestMappedSuperClass {

	public static void main(String[] args) {
		
		SessionFactory sf = new  Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Perishable product1 = new Perishable(12,"Yogurt",LocalDate.of(2023, 12, 10),LocalDate.of(2023, 12, 13));
		NonPerishable product2 = new NonPerishable(13,"Chair",LocalDate.of(2024, 12, 03),"Furniture");
		session.save(product1);
		session.save(product2);
		tr.commit();
		session.close();
		sf.close();
	}
}

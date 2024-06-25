package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {

	static SessionFactory sf;
	public static SessionFactory getMySessionFactory() {
		if(sf==null) {
			sf= new Configuration().configure().buildSessionFactory();
		}
		System.out.println("Connection Established !!");
		return sf;
	}
	
	public static void closeMySessionFactory() {
		sf.close();
		System.out.println("Connection Closed !!");
	}
}

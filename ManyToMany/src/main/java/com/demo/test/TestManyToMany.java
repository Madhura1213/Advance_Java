package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.Faculty;
import com.demo.beans.Course;

public class TestManyToMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		//faculty added
		Faculty f1=new Faculty(12,"Swati",34567,null);
		Faculty f2=new Faculty(13,"Arati",44445,null);
		Faculty f3=new Faculty(14,"Sujay",22222,null);
		Faculty f4=new Faculty(15,"Sushant",55555,null);
		
		Set<Faculty> fset1=new HashSet<Faculty>();
		Set<Faculty> fset2=new HashSet<Faculty>();
		
		//set of faculty made
		//f1 is in both set/dept
		fset1.add(f1);
		fset2.add(f1);
		
		fset1.add(f2);
		fset2.add(f3);
		fset2.add(f4);
		
		Course c1=new Course(100,"Maths",345,fset1);
		Course c2=new Course(101,"Science",500,fset2);
		
		Set<Course> maths=new HashSet<Course>();
		Set<Course> science=new HashSet<Course>();
		Set<Course> mathsci =new HashSet<Course>();
		
		maths.add(c1);
		science.add(c2);
		mathsci.add(c1);
		mathsci.add(c2);
		
		f2.setCourseset(maths);
		f3.setCourseset(science);
		f4.setCourseset(science);
		f1.setCourseset(mathsci);
		
		session.save(f1);
		session.save(f2);
		session.save(f3);
		session.save(f4);
		session.save(c1);
		session.save(c2);
		
		tr.commit();
		session.close();
		sf.close();
		
		

	}

}

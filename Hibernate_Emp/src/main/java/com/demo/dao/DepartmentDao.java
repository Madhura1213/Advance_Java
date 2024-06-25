package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.beans.Department;

public class DepartmentDao implements IDepartmentDao{
	static SessionFactory sf;
	static {
	 sf = new Configuration().configure().buildSessionFactory();
	}

	@Override
	public boolean addDepartment(Department dept) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		if(dept!=null) {
			session.save(dept);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean removeDepartment(int did) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Department d = session.get(Department.class, did);
		if(d!=null) {
			session.remove(d);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyDepartment(int did, String dname, String dloc) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Department d = session.get(Department.class, did);
		if(d!=null) {
		d.setDeptname(dname);
		d.setDloc(dloc);
		session.save(d);
		tr.commit();
		return true;
		}	
		return false;
	}

	@Override
	public Department displayDepartment(int did) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Department d = session.get(Department.class, did);
		if(d!=null) {
			return d;
		}
		return null;
	}

	@Override
	public List<Department> findAllDept() {
		List<Department> dlist = new ArrayList<>();
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Query q= session.createQuery("from department101");
		if(q!=null) {
			dlist = q.list();
			return dlist;
		}
		return null;
	}

	
	
}

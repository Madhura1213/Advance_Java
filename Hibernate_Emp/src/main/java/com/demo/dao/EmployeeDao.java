package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class EmployeeDao implements IEmployeeDao{

	static SessionFactory sf;
	static{
		sf= HBUtil.getMySessionFactory();
	}

	@Override
	public boolean addEmployee(Employee emp) {
	 Session session= sf.openSession();
	 Transaction tr = session.beginTransaction();
	 session.save(emp);
	 session.save(emp.getDept());
	 tr.commit();
	 return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		Session session= sf.openSession();
		Transaction tr = session.beginTransaction();
		 Employee emp = session.get(Employee.class, id);
		
		 if(emp!=null) {
			 session.remove(emp);
			 tr.commit();
			 return true;
		 }
		return false;
	}

	@Override
	public boolean modifyEmployee(int id, String nm, Double price) {
		Session session= sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		if(emp!=null) {
			emp.setEname(nm);
			emp.setSal(price);
			session.save(emp);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> displayEmployee() {
		Session session= sf.openSession();
		Transaction tr = session.beginTransaction();
		Query q=session.createQuery("from Employee101 ");
		List<Employee> elist =q.list();
		return elist;
	}

	@Override
	public Employee getById(int id) {
		Session session= sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		if(emp!= null) {
			return emp;
		}
		return null;
	}
	
	
	

}

package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService{

	IEmployeeDao edao;
	public EmployeeService() {
	 edao= new EmployeeDao();
	}
	Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean addNewEmployee() {
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		System.out.println("Enter empname :");
		String nm= sc.next();
		System.out.println("Enter salary:");
		Double price = sc.nextDouble();
	
	System.out.println("Enter deptid :");
	int did= sc.nextInt();
	System.out.println("Enter deptname :");
	String dnm= sc.next();
	System.out.println("Enter location:");
	String dloc = sc.next();
		
	Department dept = new Department(did,dnm,dloc,null);
	Employee emp = new Employee(id,nm,price,dept);
		return edao.addEmployee(emp);
	}

	@Override
	public boolean removeEmployee() {
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		return edao.removeEmployee(id);
	}

	@Override
	public boolean updateEmployee() {
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		System.out.println("Enter empname :");
		String nm= sc.next();
		System.out.println("Enter salary:");
		Double price = sc.nextDouble();
		return edao.modifyEmployee(id,nm,price);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return edao.displayEmployee();
	}

	@Override
	public Employee getEmpbyId() {
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		return edao.getById(id);
	}

	
	
}

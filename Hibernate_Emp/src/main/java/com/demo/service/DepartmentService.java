package com.demo.service;

import com.demo.beans.Department;
import com.demo.dao.DepartmentDao;
import com.demo.dao.IDepartmentDao;

import java.util.List;
import java.util.Scanner;

public class DepartmentService implements IDepartmentService{

	IDepartmentDao ddao;
	Scanner sc = new Scanner(System.in);
	
	public DepartmentService() {
	ddao= new DepartmentDao();
	}
	
	@Override
	public boolean addNewDept() {
		System.out.println("Enter department id: ");
		int did=sc.nextInt();
		System.out.println("Enter department name: ");
		String dname=sc.next();
		System.out.println("Enter department location: ");
		String dloc=sc.next();
		 Department dept = new Department(did,dname,dloc,null);
		return ddao.addDepartment(dept);
	}

	@Override
	public boolean removeDepartment() {
		System.out.println("Enter department id: ");
		int did=sc.nextInt();
		return ddao.removeDepartment(did);
	}

	@Override
	public boolean updateDepartment() {
		System.out.println("Enter department id: ");
		int did=sc.nextInt();
		System.out.println("Enter department name to update: ");
		String dname=sc.next();
		System.out.println("Enter department location:to update ");
		String dloc=sc.next();
		return ddao.modifyDepartment(did,dname,dloc);
	}

	@Override
	public Department getDeptbyId() {
		System.out.println("Enter department id: ");
		int did=sc.nextInt();
		return ddao.displayDepartment(did);
	}

	@Override
	public List<Department> displayAllDepartment() {
		return ddao.findAllDept();
	}

}

package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Department;
import com.demo.beans.Employee;
import com.demo.service.DepartmentService;
import com.demo.service.EmployeeService;
import com.demo.service.IDepartmentService;
import com.demo.service.IEmployeeService;

public class TestEmployeeDepartment {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		IEmployeeService eservice = new EmployeeService();
		IDepartmentService dservice = new DepartmentService();
		
		int choice=0;
		do {
			System.out.println("\n----------------------");
		System.out.println("1. Add new Employee\n 2. Add new Department\n 3. delete employee\n");
		System.out.println("4. delete department\n 5. modify Department\n 6. modify employee\n");
		System.out.println("7. display Employee by id\n 8. display Department by id\n 9. display all department\n");
		System.out.println("10. display all Employee\n 11.exit\n choice : ");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			boolean status = eservice.addNewEmployee();
			if(status) {
				System.out.println("Employee Added Successfully !!");
			}else {
				System.out.println("Unable to Add Employee !!");
			}
			break;
		case 2:
			status = dservice.addNewDept();
			if(status) {
				System.out.println("Department Added Successfully !!");
			}else {
				System.out.println("Unable to Add Department !!");
			}
			break;
		case 3:
			status = eservice.removeEmployee();
			if(status) {
				System.out.println("Employee Removed Successfully !!");
			}else {
				System.out.println("Unable to Remove Employee !!");
			}
			break;
		case 4:
			status = dservice.removeDepartment();
			if(status) {
				System.out.println("Department Removed Successfully !!");
			}else {
				System.out.println("Unable to Remove Department !!");
			}
			break;
		case 5:
			status = dservice.updateDepartment();
			if(status) {
				System.out.println("Department Updated Successfully !!");
			}else {
				System.out.println("Unable to Update Department !!");
			}
			break;
		case 6:
			status = eservice.updateEmployee();
			if(status) {
				System.out.println("Employee Updated Successfully !!");
			}else {
				System.out.println("Unable to Update Employee !!");
			}
			break;
		case 7:
			Employee emp = eservice.getEmpbyId();
			if(emp!=null) {
				System.out.println(emp);
			}
			else {
				System.out.println("Employee Not Found !!");
			}
			break;
		case 8:
			Department dept = dservice.getDeptbyId();
			if(dept!=null) {
				System.out.println(dept);
			}else {
				System.out.println("Department Not Found !!");
			}
			break;
		case 9:
			List<Department> dlist = dservice.displayAllDepartment();
			if(dlist!=null) {
				dlist.forEach(System.out::println);
			}else {
				System.out.println("Department List Not Found !!");
			}
			break;
		case 10:
			List<Employee> elist=eservice.getAllEmployee();
			elist.forEach(System.out::println);
			
			break;
		case 11:
			System.out.println("ThankYou!!!");
			break;
		default:
			break;
		}

	}while(choice!=11);
 }
}

package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface IEmployeeService {

	boolean addNewEmployee();

	boolean removeEmployee();

	boolean updateEmployee();

	List<Employee> getAllEmployee();

	Employee getEmpbyId();

	

}

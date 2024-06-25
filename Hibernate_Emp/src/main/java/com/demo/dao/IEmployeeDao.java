package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface IEmployeeDao {

	boolean addEmployee(Employee emp);

	boolean removeEmployee(int id);

	boolean modifyEmployee(int id, String nm, Double price);

	List<Employee> displayEmployee();

	Employee getById(int id);

}

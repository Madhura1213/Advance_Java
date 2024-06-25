package com.demo.service;

import java.util.List;

import com.demo.beans.Department;

public interface IDepartmentService {

	boolean addNewDept();

	boolean removeDepartment();

	boolean updateDepartment();

	Department getDeptbyId();

	List<Department> displayAllDepartment();

}

package com.demo.dao;

import java.util.List;

import com.demo.beans.Department;

public interface IDepartmentDao {

	boolean addDepartment(Department dept);

	boolean removeDepartment(int did);

	boolean modifyDepartment(int did, String dname, String dloc);

	Department displayDepartment(int did);

	List<Department> findAllDept();

	

}

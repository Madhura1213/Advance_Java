package com.demo.beans;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="department101")
public class Department {
	
	@Id
	private int deptid;
	private String deptname;
	private String dloc;
	 @OneToMany(mappedBy="dept")
	 private Set<Employee> empset= new HashSet<>();
	 
	public Department(int deptid, String deptname, String dloc, Set<Employee> empset) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.dloc = dloc;
		this.empset = empset;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", dloc=" + dloc + "]";
	}
	
	public Department() {
		super();
	}
	
	
}

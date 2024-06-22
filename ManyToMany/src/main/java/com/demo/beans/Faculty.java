package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Faculty12")
public class Faculty {

	@Id
	private int facid;
	private String fname;
	private int years;
	@ManyToMany(mappedBy="facultyset")
	 private Set<Course> courseset=new HashSet<Course>();
	
	
	public Faculty() {
		super();
	}
	public int getFacid() {
		return facid;
	}
	public void setFacid(int facid) {
		this.facid = facid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public Set<Course> getCourseset() {
		return courseset;
	}
	public void setCourseset(Set<Course> courseset) {
		this.courseset = courseset;
	}
	@Override
	public String toString() {
		return "Faculty [facid=" + facid + ", fname=" + fname + ", years=" + years + "]";
	}
	public Faculty(int facid, String fname, int years, Set<Course> courseset) {
		super();
		this.facid = facid;
		this.fname = fname;
		this.years = years;
		this.courseset = courseset;
	}
	

}

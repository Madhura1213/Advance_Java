package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course12")
public class Course {
	@Id
	private int courseid;
	private String cname;
	private int duration;
	@ManyToMany
	@JoinTable(name="Course_Faculty",joinColumns= {@JoinColumn(name="Courseno")},
	inverseJoinColumns= {@JoinColumn(name="Facultyno")})
	private Set<Faculty> facultyset=new HashSet<Faculty>();
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Set<Faculty> getFacultyset() {
		return facultyset;
	}
	public void setFacultyset(Set<Faculty> facultyset) {
		this.facultyset = facultyset;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", cname=" + cname + ", duration=" + duration + ", facultyset="
				+ facultyset + "]";
	}
	public Course(int courseid, String cname, int duration, Set<Faculty> facultyset) {
		super();
		this.courseid = courseid;
		this.cname = cname;
		this.duration = duration;
		this.facultyset = facultyset;
	}
	public Course() {
		super();
	}
	
	
	
}

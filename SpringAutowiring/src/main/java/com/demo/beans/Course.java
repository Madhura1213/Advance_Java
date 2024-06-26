package com.demo.beans;

public class Course {
	private int cid;
	private String cname;
	//containment
	private Faculty faculty;
	
	public Course() {
		super();
		System.out.println("in course default constructor");
	}
	public Course(int cid, String cname, Faculty f1) {
		super();
		System.out.println("in course parametrised constructor");
		this.cid = cid;
		this.cname = cname;
		this.faculty = f1;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		System.out.println("in course setcid");
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		System.out.println("in course setcname");
		this.cname = cname;
	}
	public Faculty getFaculty() {
		System.out.println("in course getfaculty");
		return faculty;
	}
	public void setFaculty(Faculty f1) {
		System.out.println("in course setfaculty");
		this.faculty = f1;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", Faculty=" + faculty + "]";
	}
	

}

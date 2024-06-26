package com.demo.beans;

public class Faculty {
    private int fid;
    private String fname;
    
	public Faculty() {
		super();
		System.out.println("in faculty default constructor");
	}
	public Faculty(int fid, String fname) {
		super();
		System.out.println("in faculty parametrised constructor");
		this.fid = fid;
		this.fname = fname;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		System.out.println("in faculty setfid");
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		System.out.println("in faculty setfname");
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + "]";
	}
    
}

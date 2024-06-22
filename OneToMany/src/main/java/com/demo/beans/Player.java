package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="player101")
public class Player {
	@Id
	private int Pid;
	private String Pname;
	private double salary;
	
	@ManyToOne
	@JoinColumn(name="Teamno")
	private IPLTeam team;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public IPLTeam getTeam() {
		return team;
	}
	public void setTeam(IPLTeam team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [Pid=" + Pid + ", Pname=" + Pname + ", salary=" + salary + ", team=" + team + "]";
	}
	public Player(int pid, String pname, double salary, IPLTeam team) {
		super();
		Pid = pid;
		Pname = pname;
		this.salary = salary;
		this.team = team;
	}
	
	public Player() {
		super();
	}
	
	
}

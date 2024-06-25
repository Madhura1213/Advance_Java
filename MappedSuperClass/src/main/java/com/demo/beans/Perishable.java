package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="perishable104")
public class Perishable extends Product {

	private LocalDate expdate;

	public Perishable() {
		super();
	}

	public Perishable(int pid, String pname, LocalDate mfgdate,LocalDate expdate) {
		super(pid,pname,mfgdate);
		this.expdate = expdate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return super.toString()+"PerishableProduct [expdate=" + expdate + "]";
	}
	
	
}

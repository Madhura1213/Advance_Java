package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity(name="nonperishable101")
@DiscriminatorValue("nonperishable")
public class NonPerishable extends Product {

	  private String category;

		public NonPerishable() {
			super();
		}

		public NonPerishable(int pid, String pname, LocalDate mfgdate, String category) {
			super(pid, pname, mfgdate);
			this.category = category;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return super.toString()+"NoPerishable [category=" + category + "]";
		}
	      
}

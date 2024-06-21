package com.cart.beans;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private float price;
	private int catid;
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public Product() {
		super();
	}

	public Product(int pid, String pname, int qty, double d) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = (float) d;
	}

	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", catid=" + catid
				+ "]";
	}
	
}

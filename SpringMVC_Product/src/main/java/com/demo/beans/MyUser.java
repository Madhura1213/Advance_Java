package com.demo.beans;

public class MyUser {

	private String username;
	private String password;
	
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public MyUser() {
		super();
	}
	
	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + "]";
	}
	
}

package com.myapp.beans;

public class MyUser {

	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [ username=" + username + ", password=" + password + "]";
	}
	
	public MyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
}

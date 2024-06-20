package com.myapp.beans;

import java.util.Arrays;

public class RegisterUser {

	private String name;
	private String gender;
	private String[] skill;
	private String username;
	private String password;
	private String question;
	private String answer;
	
	
	public RegisterUser(String name, String gender, String[] skill, String username, String password, String question,
			String answer) {
		super();
		this.name = name;
		this.gender = gender;
		this.skill = skill;
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
	}
	
	

	public RegisterUser(String username, String question, String answer) {
		super();
		this.username = username;
		this.question = question;
		this.answer = answer;
	}



	@Override
	public String toString() {
		return "RegisterUser [name=" + name + ", gender=" + gender + ", skill=" + Arrays.toString(skill) + ", username="
				+ username + ", password=" + password + ", question=" + question + ", answer=" + answer + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getSkill() {
		return skill;
	}
	public void setSkill(String[] skill) {
		this.skill = skill;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}

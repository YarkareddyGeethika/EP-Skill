package com.db.StudentBean;

public class Student {
	private int regno;
	private String name;
	private String email;
	public void setReg(int regno) {
		this.regno = regno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getReg() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
}

package com.kitchenstorey.api;

import javax.validation.constraints.AssertTrue;

public class Admin {
	private String name;
	private String password;
	@AssertTrue(message="Invalid Credentials")
	private boolean check;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
}

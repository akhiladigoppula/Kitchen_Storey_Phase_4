package com.kitchenstorey.api;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

public class Customer {
	@NotBlank(message = "Please enter your name")
private String name;
	@Email(message = "Please enter a Valid Mail ID")
private String email;
@NotBlank(message = "Please enter your address")	
private String address;
@Size(max=10,min=10,message = "Please enter 10 digit mobile number")
private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

}

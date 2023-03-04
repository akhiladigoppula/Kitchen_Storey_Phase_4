package com.kitchenstorey.api;

import javax.validation.constraints.NotBlank;

public class Payment {
	private String cardno;
	private String date;
	private int cvv;
	@NotBlank(message = "Please enter your name")
	private String chname;
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getChname() {
		return chname;
	}
	public void setChname(String chname) {
		this.chname = chname;
	}
	
}

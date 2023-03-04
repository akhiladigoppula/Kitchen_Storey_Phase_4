package com.kitchenstorey.api;


import javax.validation.constraints.Size;

import com.kitchenstorey.annotation.NewPassword;
import com.kitchenstorey.annotation.OldPassword;

public class ChangePassword {
	@OldPassword
	private String oldPassword;

	@Size(min = 5, message = "Minimum 5 characters required")
	@NewPassword
	private String newPassword;
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}

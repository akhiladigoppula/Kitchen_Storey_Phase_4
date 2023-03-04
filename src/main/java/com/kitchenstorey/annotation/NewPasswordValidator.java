package com.kitchenstorey.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.kitchenstorey.api.Admin;
import com.kitchenstorey.dao.KitchenStoreyDAO;

public class NewPasswordValidator implements ConstraintValidator<NewPassword, String> {
	@Autowired
	KitchenStoreyDAO dao;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Admin admin=dao.getAdmin();
		if(admin.getPassword().equals(value)) {
			return false;
		}
		else return true;
	}

}

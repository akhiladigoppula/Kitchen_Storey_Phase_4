package com.kitchenstorey.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.kitchenstorey.api.Admin;
import com.kitchenstorey.dao.KitchenStoreyDAO;

public class OldPasswordValidator implements ConstraintValidator<OldPassword, String> {
	@Autowired
	KitchenStoreyDAO dao;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Admin admin = dao.getAdmin();
		if(admin.getPassword().equals(value)) {
			return true;
		}
		else
		return false;
	}
	
}

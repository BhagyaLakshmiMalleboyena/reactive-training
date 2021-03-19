
package com.example.customer.application.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.customer.application.Request.CustomerRegistrationCreationReq;
import com.example.customer.application.Request.CustomerRegistrationCreationResponse;
import com.example.customer.application.service.CustomerService;

public class UniquePhoneNumberValidator
		implements ConstraintValidator<UniquePhoneNumber, CustomerRegistrationCreationReq> {

	@Autowired
	protected CustomerService customerService;

	@Override
	public boolean isValid(CustomerRegistrationCreationReq value, ConstraintValidatorContext context) {
		System.out.println("phone m=number:" + value.getPhonenumber());
		CustomerRegistrationCreationResponse findCustomerByPhoneNum = customerService
				.getCustomerByPhoneNum(value.getPhonenumber());
		if (findCustomerByPhoneNum != null) {
			return false;
		}
		return true;
	}

}

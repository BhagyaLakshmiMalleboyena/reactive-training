package com.example.customer.application.validation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.customer.application.Request.CustomerRegistrationCreationReq;

public class AgeValidation implements ConstraintValidator<Age, CustomerRegistrationCreationReq> {

	@Override
	public boolean isValid(CustomerRegistrationCreationReq Req, ConstraintValidatorContext context) {
		Period p = Period.between(LocalDate.parse(Req.getDateOfBirth(), DateTimeFormatter.ofPattern("MM-dd-yyyy")),
				LocalDate.now());
		return p.getYears() == Req.getAge();
	}
}

package com.example.customer.application.validation;

import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.example.customer.application.Request.CustomerRegistrationCreationReq;

/**
 * The Class CustomerRegistrationInputValidation.
 */
@Component
public class CustomerRegistrationInputValidation {

	/**
	 * Checks if is validation error.
	 *
	 * @param errors the errors
	 * @param custReg the cust reg
	 * @return true, if is validation error
	 */
	public boolean isValidationError(Map<String, String> errors, CustomerRegistrationCreationReq custReg) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CustomerRegistrationCreationReq>> violations = validator.validate(custReg);
		if (!violations.isEmpty()) {
			for (ConstraintViolation<CustomerRegistrationCreationReq> violation : violations) {
				String path = String.valueOf(violation.getPropertyPath());
				if (path.equals("")) {
					errors.put("error message", violation.getMessage());
				} else {
					errors.put(String.valueOf(violation.getPropertyPath()), violation.getMessage());
				}
			}
			return true;
		}
		return false;
	}
}

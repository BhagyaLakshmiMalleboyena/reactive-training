
package com.example.customer.application.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME)

@Constraint(validatedBy = UniquePhoneNumberValidator.class)
public @interface UniquePhoneNumber {

	String message() default "phone number already exists";

	Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {};

}

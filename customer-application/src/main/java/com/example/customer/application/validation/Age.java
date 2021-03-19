package com.example.customer.application.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidation.class)
public @interface Age {
	String message() default "age and date of birth doesnt match";
	Class<?>[] groups() default {};
	public abstract Class<? extends Payload>[] payload() default {};
}

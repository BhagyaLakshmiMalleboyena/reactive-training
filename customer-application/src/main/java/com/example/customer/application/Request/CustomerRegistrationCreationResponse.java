package com.example.customer.application.Request;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The Class CustomerRegistrationCreationResponse.
 */
@Component
//@Scope(value = "prototype")
public class CustomerRegistrationCreationResponse extends CommonResponse {

	/** The customer details output. */
	protected CustomerRegistrationCreationOuput customerDetailsOutput;

	/**
	 * Gets the customer details output.
	 *
	 * @return the customer details output
	 */
	public CustomerRegistrationCreationOuput getCustomerDetailsOutput() {
		return customerDetailsOutput;
	}

	/**
	 * Sets the customer details output.
	 *
	 * @param customerDetailsOutput the new customer details output
	 */
	public void setCustomerDetailsOutput(CustomerRegistrationCreationOuput customerDetailsOutput) {
		this.customerDetailsOutput = customerDetailsOutput;
	}

}

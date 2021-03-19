package com.example.customer.application.service;

import java.util.List;

import com.example.customer.application.Request.CustomerRegistrationCreationResponse;
import com.example.customer.application.model.CustomerRegistration;

/**
 * The Interface CustomerService.
 */
public interface CustomerService {
	
	/**
	 * Save customer details.
	 *
	 * @param custReg the cust reg
	 */
	public void saveCustomerDetails(CustomerRegistration custReg);

	/**
	 * Gets the all customer details.
	 *
	 * @param name the name
	 * @return the all customer details
	 */
	public List<CustomerRegistration> getAllCustomerDetails(String name);

	/**
	 * Gets the login details.
	 *
	 * @param phonenumber the phonenumber
	 * @param password the password
	 * @return the login details
	 */
	public CustomerRegistrationCreationResponse getLoginDetails(String phonenumber, String password);

	/**
	 * Gets the customer by phone num.
	 *
	 * @param phonenumber the phonenumber
	 * @return the customer by phone num
	 */
	public CustomerRegistrationCreationResponse getCustomerByPhoneNum(String phonenumber);
}

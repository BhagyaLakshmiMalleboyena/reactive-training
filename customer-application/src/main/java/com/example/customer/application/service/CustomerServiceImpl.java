package com.example.customer.application.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.application.Request.CustomerRegistrationCreationOuput;
import com.example.customer.application.Request.CustomerRegistrationCreationResponse;
import com.example.customer.application.Respository.CustomerRespository;
import com.example.customer.application.model.CustomerRegistration;

/**
 * The Class CustomerServiceImpl.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/** The customer respository. */
	@Autowired
	public CustomerRespository customerRespository;

	/*
	 * @Autowired public CustomerRegistrationCreationResponse
	 * customerRegistrationCreationResponse;
	 * 
	 * @Autowired public CustomerRegistrationCreationOuput
	 * customerRegistrationCreationOutput;
	 */

	/**
	 * Save customer details.
	 *
	 * @param custReg the cust reg
	 */
	@Override
	public void saveCustomerDetails(CustomerRegistration custReg) {
		String encodedPassword = Base64.getEncoder().encodeToString(custReg.getPassword().getBytes());
		custReg.setPassword(encodedPassword);
		customerRespository.save(custReg);
	}

	/**
	 * Gets the all customer details.
	 *
	 * @param name the name
	 * @return the all customer details
	 */
	@Override
	public List<CustomerRegistration> getAllCustomerDetails(String name) {
		List<CustomerRegistration> findCustomersByName = customerRespository.findCustomersByName(name);
		return findCustomersByName;
	}

	/**
	 * Gets the login details.
	 *
	 * @param phonenumber the phonenumber
	 * @param password    the password
	 * @return the login details
	 */
	@Override
	public CustomerRegistrationCreationResponse getLoginDetails(String phonenumber, String password) {
		String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
		CustomerRegistration findLoginDetails = customerRespository.findLoginDetails(phonenumber, encodedPassword);
		CustomerRegistrationCreationResponse customerRegistrationCreationResponse = new CustomerRegistrationCreationResponse();
		if (findLoginDetails != null) {
			CustomerRegistrationCreationOuput customerRegistrationCreationOutput = new CustomerRegistrationCreationOuput();
			customerRegistrationCreationOutput.setId(findLoginDetails.getId());
			customerRegistrationCreationOutput.setAddress(findLoginDetails.getAddress());
			customerRegistrationCreationOutput.setAge(findLoginDetails.getAge());
			customerRegistrationCreationOutput.setDateOfBirth(findLoginDetails.getDateOfBirth());
			customerRegistrationCreationOutput.setMailId(findLoginDetails.getMailId());
			customerRegistrationCreationOutput.setMaritalStatus(findLoginDetails.getMaritalStatus());
			customerRegistrationCreationOutput.setName(findLoginDetails.getUserName());
			customerRegistrationCreationOutput.setPassword(findLoginDetails.getPassword());
			customerRegistrationCreationOutput.setPhonenumber(findLoginDetails.getPhonenumber());
			customerRegistrationCreationOutput.setSurName(findLoginDetails.getSurName());
			customerRegistrationCreationResponse.setCustomerDetailsOutput(customerRegistrationCreationOutput);
		} else {
			customerRegistrationCreationResponse.setMessage("results not found");
		}
		return customerRegistrationCreationResponse;
	}

	/**
	 * Gets the customer by phone num.
	 *
	 * @param phonenumber the phonenumber
	 * @return the customer by phone num
	 */
	@Override
	public CustomerRegistrationCreationResponse getCustomerByPhoneNum(String phonenumber) {
		CustomerRegistration findCustomerByPhoneNum = customerRespository.findCustomerByPhoneNum(phonenumber);
		CustomerRegistrationCreationResponse customerRegistrationCreationResponse = new CustomerRegistrationCreationResponse();
		if (findCustomerByPhoneNum != null) {
			CustomerRegistrationCreationOuput customerRegistrationCreationOutput = new CustomerRegistrationCreationOuput();
			customerRegistrationCreationOutput.setId(findCustomerByPhoneNum.getId());
			customerRegistrationCreationOutput.setAddress(findCustomerByPhoneNum.getAddress());
			customerRegistrationCreationOutput.setAge(findCustomerByPhoneNum.getAge());
			customerRegistrationCreationOutput.setDateOfBirth(findCustomerByPhoneNum.getDateOfBirth());
			customerRegistrationCreationOutput.setMailId(findCustomerByPhoneNum.getMailId());
			customerRegistrationCreationOutput.setMaritalStatus(findCustomerByPhoneNum.getMaritalStatus());
			customerRegistrationCreationOutput.setName(findCustomerByPhoneNum.getUserName());
			customerRegistrationCreationOutput.setPassword(findCustomerByPhoneNum.getPassword());
			customerRegistrationCreationOutput.setPhonenumber(findCustomerByPhoneNum.getPhonenumber());
			customerRegistrationCreationOutput.setSurName(findCustomerByPhoneNum.getSurName());
			customerRegistrationCreationResponse.setCustomerDetailsOutput(customerRegistrationCreationOutput);
		}
		return customerRegistrationCreationResponse;
	}
}

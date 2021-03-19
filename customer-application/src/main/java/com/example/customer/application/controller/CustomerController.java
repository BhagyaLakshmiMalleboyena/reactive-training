package com.example.customer.application.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.application.Request.CustomerLoginRequest;
import com.example.customer.application.Request.CustomerRegistrationCreationReq;
import com.example.customer.application.Request.CustomerRegistrationCreationResponse;
import com.example.customer.application.model.CustomerRegistration;
import com.example.customer.application.service.CustomerService;
import com.example.customer.application.validation.CustomerRegistrationInputValidation;
import com.example.customer.application.vo.CustomerVo;

/**
 * The Class CustomerController.
 */
@RestController
//@RequestMapping("/customer")
public class CustomerController {

	/** The customer service. */
	@Autowired
	public CustomerService customerService;

	@Autowired
	public CustomerVo customerVo;

	@Autowired
	public CustomerRegistrationInputValidation customerRegistrationInputValidation;

	@GetMapping("/")
	public String home() {
		return ("<h1>welcome</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}

	@GetMapping("/adminget")
	public String adminGet() {
		return "success";
	}

	/**
	 * Customer registaration.
	 *
	 * @param custReg the cust reg
	 * @return the string
	 */
	@SuppressWarnings("null")
	@PostMapping("/registration")
	public Map<String, String> customerRegistaration(@Valid @RequestBody CustomerRegistrationCreationReq custReg) {
		String message = "success";
		Map<String, String> errors = new HashMap<>();
		try {
			boolean validationError = customerRegistrationInputValidation.isValidationError(errors, custReg);
			if (!validationError) {
				CustomerRegistrationCreationResponse customerRegistrationCreationResponse = customerService
						.getCustomerByPhoneNum(custReg.getPhonenumber());
				if (customerRegistrationCreationResponse.getCustomerDetailsOutput() != null) {
					errors.put("message", "phone number already exists");
				} else {
					CustomerRegistration customerRegistration = customerVo.customerRegistration(custReg);
					customerService.saveCustomerDetails(customerRegistration);
					errors.put("message", message);
				}
			}
		} catch (Exception e) {
			errors = new HashMap<>();
			errors.put("Exception message", e.getMessage());
			return errors;
		}
		return errors;
	}

	/**
	 * Gets the all customers.
	 *
	 * @param name the name
	 * @return the all customers
	 */
	@GetMapping("/getAllCustomers/{name}")
	public List<CustomerRegistration> getAllCustomers(@PathVariable(value = "name") String name) {
		List<CustomerRegistration> allCustomerDetails = null;
		try {
			allCustomerDetails = customerService.getAllCustomerDetails(name);
		} catch (Exception e) {
			return allCustomerDetails;
		}
		return allCustomerDetails;
	}

	/**
	 * Gets the all customers.
	 *
	 * @param custReg the cust reg
	 * @return the all customers
	 */
	@PostMapping("/login")
	public CustomerRegistrationCreationResponse getLoginDetails(@Valid @RequestBody CustomerLoginRequest custReg) {
		CustomerRegistrationCreationResponse loginDetails = null;
		try {
			loginDetails = customerService.getLoginDetails(custReg.getUserName(), custReg.getPassword());
		} catch (Exception e) {
			System.out.println("exception is:" + e.getMessage());
		}
		return loginDetails;
	}
}

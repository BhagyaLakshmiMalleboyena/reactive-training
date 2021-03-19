package com.example.customer.application.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.customer.application.Request.CustomerRegistrationCreationReq;
import com.example.customer.application.model.CustomerRegistration;

/**
 * The Class CustomerVo.
 */
@Component
public class CustomerVo {

	/** The cust req. */
	@Autowired
	public CustomerRegistration custReq;

	/**
	 * Customer registration.
	 *
	 * @param creationReq the creation req
	 * @return the customer registration
	 */
	public CustomerRegistration customerRegistration(CustomerRegistrationCreationReq creationReq) {
		// CustomerRegistration custReq = new CustomerRegistration();
		custReq.setAddress(creationReq.getAddress());
		custReq.setAge(creationReq.getAge());
		custReq.setMailId(creationReq.getMailId());
		custReq.setMaritalStatus(creationReq.getMaritalStatus());
		custReq.setUserName(creationReq.getUserName());
		custReq.setPassword(creationReq.getPassword());
		custReq.setPhonenumber(creationReq.getPhonenumber());
		custReq.setSurName(creationReq.getSurName());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		// convert String to LocalDate
		LocalDate localDate = LocalDate.parse(creationReq.getDateOfBirth(), formatter);
		custReq.setDateOfBirth(localDate);
		// custReq.setActive(creationRe);
		custReq.setRoles(creationReq.getRoles());
		return custReq;
	}
}

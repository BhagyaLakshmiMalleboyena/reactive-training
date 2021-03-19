package com.example.customer.application.Request;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class CustomerLoginRequest {

	@NotBlank(message = "user name/phone number required")
	protected String userName;
	@NotBlank(message = "password required")
	protected String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

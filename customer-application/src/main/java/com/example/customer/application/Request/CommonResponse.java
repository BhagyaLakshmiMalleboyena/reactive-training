package com.example.customer.application.Request;

import org.springframework.stereotype.Component;

@Component
public class CommonResponse {
	protected String statusCode;
	protected String message;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

package com.example.customer.application.Request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.example.customer.application.validation.Age;

/**
 * The Class CustomerRegistrationCreationReq.
 */
@Component
@Age
//@UniquePhoneNumber
public class CustomerRegistrationCreationReq {

	/** The id. */
	protected Long id;

	/** The name. */
	@NotNull(message = "name can not be null")
	// @NotEmpty(message = "name can not be empty")
	// @NotBlank(message = "name can not be blank")
	@Size(min = 2, message = "name length must be greater than 2")
	protected String userName;

	/** The sur name. */
	@NotNull(message = "surname can not be null")
	protected String surName;

	/** The age. */
	@Min(value = 18, message = "must be equal or greater than 18")
	@Max(value = 45, message = "must be equal or less than 45")
	protected int age;

	/** The marital status. */
	protected String maritalStatus;

	/** The address. */
	protected String address;

	/** The password. */
	@NotNull(message = "password cannot be null")
	@Size(min = 8, max = 16, message = "password must be greater than 8 and less than 16")
	protected String password;

	/** The phonenumber. */

	@NotNull(message = "phonenumber cannot be null")
	@NotBlank(message = "phonenumber cannot be null")
	protected String phonenumber;

	/** The mail id. */
	@NotNull(message = "mail id  cannot be null")
	@Email
	protected String mailId;

	/** The date of birth. */
	@NotNull(message = "Date of birth is the reuired field")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	protected String dateOfBirth;
	
	/** The active. */
	protected String active;
	
	/** The roles. */
	protected String roles;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the sur name.
	 *
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * Sets the sur name.
	 *
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the marital status.
	 *
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * Sets the marital status.
	 *
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the phonenumber.
	 *
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * Sets the phonenumber.
	 *
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Gets the mail id.
	 *
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * Sets the mail id.
	 *
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * Gets the date of birth.
	 *
	 * @return the date of birth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the date of birth.
	 *
	 * @param dateOfBirth the new date of birth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * Gets the roles.
	 *
	 * @return the roles
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * Sets the roles.
	 *
	 * @param roles the new roles
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "CustomerRegistrationCreationReq [id=" + id + ", name=" + userName + ", surName=" + surName + ", age=" + age
				+ ", maritalStatus=" + maritalStatus + ", address=" + address + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", mailId=" + mailId + "]";
	}

}

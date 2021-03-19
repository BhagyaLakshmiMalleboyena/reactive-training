package com.example.customer.application.Respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.customer.application.model.CustomerRegistration;

/**
 * The Interface CustomerRespository.
 */
public interface CustomerRespository extends JpaRepository<CustomerRegistration, Long> {

	/**
	 * Find customers by name.
	 *
	 * @param name the name
	 * @return the list
	 */
	@Query(value = "SELECT * FROM customer_registration WHERE NAME =?1", nativeQuery = true)
	public List<CustomerRegistration> findCustomersByName(String name);

	/**
	 * Find login details.
	 *
	 * @param phoneNumber the phone number
	 * @param password    the password
	 * @return the customer registration
	 */
	@Query(value = "SELECT * FROM customer_registration WHERE PHONE_NUMBER =?1 AND PASSWORD=?2", nativeQuery = true)
	public CustomerRegistration findLoginDetails(String phoneNumber, String password);

	/**
	 * Find customer by phone num.
	 *
	 * @param phoneNumber the phone number
	 * @return the customer registration
	 */
	@Query(value = "SELECT * FROM customer_registration WHERE PHONE_NUMBER =?1", nativeQuery = true)
	public CustomerRegistration findCustomerByPhoneNum(String phoneNumber);
	
	@Query(value = "SELECT * FROM customer_registration WHERE NAME =?1", nativeQuery = true)
	Optional<CustomerRegistration> findByUserName(String userName);
}

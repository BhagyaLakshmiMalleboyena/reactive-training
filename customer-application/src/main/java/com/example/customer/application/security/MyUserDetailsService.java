package com.example.customer.application.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.customer.application.Respository.CustomerRespository;
import com.example.customer.application.model.CustomerRegistration;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	CustomerRespository customerRespository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<CustomerRegistration> findByUserName = customerRespository.findByUserName(userName);
		findByUserName.orElseThrow(() -> new UsernameNotFoundException("not found"));
		return findByUserName.map(UserDetailsImpl::new).get();
	}
}

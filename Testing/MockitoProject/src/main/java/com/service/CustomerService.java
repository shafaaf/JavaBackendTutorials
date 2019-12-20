package com.service;

import java.util.UUID;

import com.dao.CustomerDao;
import com.entity.Customer;

public class CustomerService {
	private CustomerDao dao;
	
	public void register(Customer customer){
		customer.setToken(generateToken());
		dao.save(customer);
	}

	private String generateToken() {
		return UUID.randomUUID().toString();
	}

	public Customer addCustomer(Customer customer) {
		try {
			return dao.save(customer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public Customer changeEmail(String oldEmail, String newEmail) {
		Customer customer = new Customer();
		dao.updateEmail(customer , newEmail);
		return customer;
	}

}

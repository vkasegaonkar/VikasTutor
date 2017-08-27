package com.vikasTutor.service;

import java.util.List;

import com.vikasTutor.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepositoryService repositoryService = new CustomerRepositoryServiceImpl();

	public List<Customer> getAllCustomer() {
		return repositoryService.getAllCustomers();
	}
}

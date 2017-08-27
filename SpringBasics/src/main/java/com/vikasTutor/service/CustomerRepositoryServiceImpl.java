package com.vikasTutor.service;

import java.util.ArrayList;
import java.util.List;

import com.vikasTutor.model.Customer;

public class CustomerRepositoryServiceImpl implements CustomerRepositoryService{

	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Vikas");
		customer.setLastName("Kasegaonkar");
		customers.add(customer);
		return customers;
	}
}

package com.diksha.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diksha.entity.Customer;

public interface CustomerService  {
	
	public Customer saveCustomer(Customer cust);
	
	public List<Customer> viewCustomers();
	
	public Customer viewCustomer(int id);
	
	void deleteCustomer(int id);
}

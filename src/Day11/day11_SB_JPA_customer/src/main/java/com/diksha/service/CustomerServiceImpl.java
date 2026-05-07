package com.diksha.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.diksha.entity.Customer;
import com.diksha.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerRepository custRepo;
	@Override
	public Customer saveCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		return custRepo.save(cust);
	}

	@Override
	public List<Customer> viewCustomers() {
		// TODO Auto-generated method stub
		return custRepo.viewAllActiveRecords();
	}

	@Override
	public Customer viewCustomer(int id) {
		// TODO Auto-generated method stub
		return custRepo.viewActiveCustomer(id).get();
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
// record exists or not have to check
		
		Optional<Customer> cust = custRepo.viewActiveCustomer(id);
	Customer c=null;
	if(cust.isPresent())
	{
		c=cust.get();
		c.setDeleted(true);
		custRepo.save(c);
	}
	
	}
	
	//for pagination
	public Page<Customer> getCustomers(int page, int size){
		
		PageRequest pageable= PageRequest.of(page, size);
		
		return custRepo.findAll(pageable);
	}
}



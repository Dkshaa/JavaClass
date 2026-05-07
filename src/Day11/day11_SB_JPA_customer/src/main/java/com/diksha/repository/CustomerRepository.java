package com.diksha.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	//custom query
	@Query("from Customer where isDeleted=false ")
	public List<Customer> viewAllActiveRecords();
	
	//pre-defined delete query,you can use either this or custom query
	//  List<Customer> findByDeletedFalse();
	
	@Query("from Customer where isDeleted=false And cid=:cid")
	public Optional<Customer> viewActiveCustomer(@Param("cid") int id);
	
	//For Pagination
	Page<Customer> findAll(Pageable pageable);
	
	//combine with pagination and non-deleted records
	Page<Customer> findByDeletedFalse(Pageable pageable);

}

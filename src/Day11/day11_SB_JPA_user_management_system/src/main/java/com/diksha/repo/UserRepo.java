package com.diksha.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diksha.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	//this will only retrieve active users where deleted=false
	Page<User> findByDeletedFalse(Pageable pageable);

}

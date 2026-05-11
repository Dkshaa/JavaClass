package com.diksha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diksha.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}

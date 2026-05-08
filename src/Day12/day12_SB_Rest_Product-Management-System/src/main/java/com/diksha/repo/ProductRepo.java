package com.diksha.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	public List<Product> findByIsDeletedFalse();
	
	@Query("from Product where isDeleted= false And pid=:pi")
	Optional<Product> viewActiveProduct(@Param ("pi") long pi);
}

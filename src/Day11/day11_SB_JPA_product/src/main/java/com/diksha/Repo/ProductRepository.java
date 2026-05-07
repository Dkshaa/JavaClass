
package com.diksha.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("from Product where isDeleted=false")
	public List<Product>viewAllActiveProduct();
	
	@Query("from Product where isDeleted = false and uid = :uid")
	public Optional<Product> viewActiveProduct(@Param("uid") int uid);

}

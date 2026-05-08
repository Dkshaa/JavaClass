package com.diksha.service;

import java.util.List;
import java.util.Optional;

import com.diksha.dto.ProductDto;
import com.diksha.entity.Product;

public interface ProductService {
	public ProductDto saveProduct(ProductDto dto);
	
	public List<Product> viewAllProducts();
	
	public Optional<Product> viewActiveProduct(long pid);
	
	public void deleteProduct(long pid);

}

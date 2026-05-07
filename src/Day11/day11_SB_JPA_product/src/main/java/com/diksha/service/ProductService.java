package com.diksha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diksha.entity.Product;

@Service
public interface ProductService {
	
public Product saveProduct(Product prd);
	
	public List<Product> viewProducts();
	
	public Product viewProduct(int id);
	
	void deleteProduct(int id);
}



package com.diksha.service;

import java.util.List;
import java.util.Optional;

import com.diksha.dto.ProductDto;
import com.diksha.entity.Product;

public interface ProductService {
	public ProductDto saveProduct(ProductDto dto);
	
	public List<Product> viewAllProducts();
	
	public Product viewActiveProduct(long pid);
	
	public void deleteProduct(long pid);
	
	public Product updateProduct(long pid,Product p);

}

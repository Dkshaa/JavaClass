package com.diksha.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.dto.ProductDto;
import com.diksha.entity.Product;
import com.diksha.exception.ResourceNotFoundException;
import com.diksha.repo.ProductRepo;
import com.diksha.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {

	  @Autowired
	  private ProductRepo productRepo;
	  
	
	public ProductServiceImpl(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}



	@Override
	public ProductDto saveProduct(ProductDto dto) {
		
		//Entity class object
		Product p =new Product();
		//copy whatever is obtained from dto in entity class
		BeanUtils.copyProperties(dto, p);
		p.setDeleted(false);
		
		Product saveEnt = productRepo.save(p);
		
		ProductDto dto1 = new ProductDto();
		//copy properties of source to destination
		BeanUtils.copyProperties(saveEnt, dto1);
		return dto1;
	}

	

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findByIsDeletedFalse();
	}

	@Override
	public Product viewActiveProduct(long pid) {
		// TODO Auto-generated method stub
		return productRepo.viewActiveProduct(pid).orElseThrow(()-> 
		new ResourceNotFoundException("Product Not Found With Given Id :"+ pid));
		
	
	}



	@Override
	
	public void deleteProduct(long pid) {
	    Product p = productRepo.viewActiveProduct(pid)
	            .orElseThrow(() ->
	                    new ResourceNotFoundException("Product Not Found With Given Id : " + pid));

	    p.setDeleted(true);
	    productRepo.save(p);
	}
	@Override
	public Product updateProduct(long pid, Product p) {
		//first check id exists or not
		
	    Product existing = productRepo.viewActiveProduct(pid)
	            .orElseThrow(() ->
	                    new ResourceNotFoundException("Product Not Found With Given Id : " + pid));

	    existing.setName(p.getName());
	    existing.setPrice(p.getPrice());
	    existing.setQuantity(p.getQuantity());

	    return productRepo.save(existing);
	}

	}



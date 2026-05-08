package com.diksha.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.diksha.dto.ProductDto;
import com.diksha.entity.Product;
import com.diksha.repo.ProductRepo;
import com.diksha.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepo  productRepo;
	
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
	public Optional<Product> viewActiveProduct(long pid) {
		// TODO Auto-generated method stub
		return productRepo.viewActiveProduct(pid);
				
	}

	@Override
	public void deleteProduct(long pid) {
		// TODO Auto-generated method stub
		Optional<Product> prd= productRepo.viewActiveProduct(pid);
		Product p =null;
		
		if(prd.isPresent()) {
			p=prd.get();
			p.setDeleted(true);
			productRepo.save(p);
			
		}

	}

}

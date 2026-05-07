package com.diksha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.Repo.ProductRepository;
import com.diksha.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository prdRepo;

	@Override
	public Product saveProduct(Product prd) {
		// TODO Auto-generated method stub
		return prdRepo.save(prd);
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return prdRepo.viewAllActiveProduct();
	}

	@Override
	public Product viewProduct(int id) {
		// TODO Auto-generated method stub
		return prdRepo.viewAllActiveProduct(id).get();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub

		Optional<Product> prd = prdRepo.viewActiveProduct(id);
		Product p =null;
		if(p!=null) {
			p=prd.get();
			p.setDeleted(true);
			prdRepo.save(p);
		}
		
	}	

}

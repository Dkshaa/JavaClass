package com.diksha.service.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.dto.ProductDto;
import com.diksha.entity.Product;
import com.diksha.service.impl.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/prd")
public class ProductController {
	
	private final ProductServiceImpl productService;
	
	@GetMapping("/test")
	public String test() {
	    return "Product controller working";
	}
	@PostMapping("/create")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(dto));
				
	}
	
	@GetMapping("/get")
	public List<Product> showAllProducts()
	{
		return productService.viewAllProducts();
	}
	
	@DeleteMapping("/remove/{pid}")
	public void softDelete(@PathVariable long pid)
//	public ResponseEntity<?> removeProduct(@PathVariable long pid)
	{
		 productService.deleteProduct(pid);
		ResponseEntity.status(HttpStatus.NO_CONTENT).body("deleted successfully!");
	}
	
}
	


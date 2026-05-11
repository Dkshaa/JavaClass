package com.diksha.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@Autowired
	private  ProductServiceImpl productService;
	
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

	@GetMapping("/{pid}")
	public ResponseEntity<Product> fetchProduct(@PathVariable long pid)
	{
		 Product fetchProduct = productService.viewActiveProduct(pid);
		 
		 return ResponseEntity.status(HttpStatus.OK).body(fetchProduct);
	}
	
	@DeleteMapping("/remove/{pid}")
	public void softDelete(@PathVariable long pid)
//	public ResponseEntity<?> removeProduct(@PathVariable long pid)
	{
		 productService.deleteProduct(pid);
		ResponseEntity.status(HttpStatus.NO_CONTENT).body("deleted successfully!");
	}
	
	@PutMapping("/update/{pid}")
	public ResponseEntity<Product> updateProduct(@PathVariable long pid,@RequestBody Product p) {

	    Product updatedProduct = productService.updateProduct(pid, p);

	    return ResponseEntity.ok(updatedProduct);
	}
}
	


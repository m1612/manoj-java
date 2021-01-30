package com.manoj.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.model.Product;
import com.manoj.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public ResponseEntity<String> saveProduct(
			@RequestBody Product product) {

		Integer id = service.saveProduct(product);
		return new ResponseEntity<String> ("product saved"+id,HttpStatus.OK) ;

	}
	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> list=service.getAllProduct();
		
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}

}

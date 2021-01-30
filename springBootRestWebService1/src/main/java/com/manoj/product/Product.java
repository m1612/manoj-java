package com.manoj.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Product {
	
	
	@GetMapping("/all")	
	public ResponseEntity<String> getAllProduct(){

		ResponseEntity<String> rs= new ResponseEntity<String>("FROM ALL", HttpStatus.OK);
		return null;
	}
	@PostMapping("/update")
	public ResponseEntity<String> insertProductData(){
		ResponseEntity<String> rs= new ResponseEntity<String>("FROM UPDATE", HttpStatus.OK);
		return null;
	}
	

}

package com.manoj.service;

import java.util.List;

import com.manoj.model.Product;

public interface ProductService {
	
	 public Integer saveProduct(Product pr);
	 List<Product> getAllProduct();

}

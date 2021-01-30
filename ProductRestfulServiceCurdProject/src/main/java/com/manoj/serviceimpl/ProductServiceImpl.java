package com.manoj.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.model.Product;
import com.manoj.repo.ProductRepo;
import com.manoj.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public Integer saveProduct(Product pr) {
		
		double cost=pr.getProdCost();
		pr=repo.save(pr);
		double gst=cost*12.0/100;
		double discount=cost*12.0/100;
		
		pr.setProdgst(gst);
		pr.setProdDisc(discount);
		
		return pr.getProdId() ;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list=repo.findAll();
		
		
		return list;
	}

}

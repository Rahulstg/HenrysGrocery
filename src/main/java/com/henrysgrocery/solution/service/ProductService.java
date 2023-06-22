package com.henrysgrocery.solution.service;

import org.springframework.stereotype.Service;

import com.henrysgrocery.solution.entity.Product;

@Service
public class ProductService {

	
	

	public Double getTotalCost(Integer soupcount, Integer breadcount) {
		
		Product	 prd = new Product();
			prd.setProductname("soup");
			prd.setUnit("tin");
			prd.setCost(0.65);
		return (Double.parseDouble(String.format("%.2f", prd.getCost() * soupcount)) + (breadcount * 0.80)) - 0.40;

	//	return 0.2;
	}
}

package com.henrysgrocery.solution.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.henrysgrocery.solution.entity.Product;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
	
	
	
	  @InjectMocks 
	  ProductService productService;
	 
	
	private Product prd;
	
	@BeforeEach
	public  void setup(){
	
		 prd = new Product();
		prd.setProductname("soup");
		prd.setUnit("tin");
		prd.setCost(0.65);
		
		
	}
	
	@Test
	void testbucket1() throws Exception {
		/*
		 * Price a basket containing: 3 tins of soup and 2 loaves of bread, bought
		 * today, Expected total cost = 3.15;
		 */

		prd = new Product();
		prd.setProductname("soup");
		prd.setUnit("tin");
		prd.setCost(0.65);

		//double cost = (Double.parseDouble(String.format("%.2f", prd.getCost() * 3)) + (2 * 0.80)) - 0.40;

		double cost =	productService.getTotalCost(3, 2);
		assertEquals(3.15, cost);

	}
	
	
	
	

}

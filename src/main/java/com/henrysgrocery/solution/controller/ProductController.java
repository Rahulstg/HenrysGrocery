package com.henrysgrocery.solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.henrysgrocery.solution.service.ProductService;



@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	 @GetMapping("/publish")
	    public ResponseEntity<String> getTotalCost(@RequestParam Integer soupcount, Integer breadcount ){
	        
		 double cost =productService.getTotalCost(soupcount,breadcount);
	        return ResponseEntity.ok("Total cost is"+ cost);
	    }
	
	

}

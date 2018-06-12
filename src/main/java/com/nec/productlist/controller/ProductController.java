package com.nec.productlist.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	@GetMapping(path = "/products")
	public List<String> getProducts(){
		 List<String> products = Arrays.asList("iPad","iPhone","iPod");
		return products;
	}

}

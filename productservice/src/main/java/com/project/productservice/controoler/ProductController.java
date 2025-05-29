package com.project.productservice.controoler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.productservice.dto.ProductRequest;
import com.project.productservice.dto.ProductResponse;
import com.project.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public String message() {
		System.out.println("Testing the app!!!");
		return "Hello";
	}
	
	@PostMapping("/createProduct")
	public String createProduct(@RequestBody ProductRequest productRequest) {
		logger.debug("creating the priduct :: {}" , productRequest);
		logger.debug("creating the priduct with gson :: {}" , new Gson().toJson(productRequest));
		productService.insertProduct(productRequest);

		logger.info("Product created successfully");
		return "Product created successfully";
		
	}
	
	@GetMapping("/getAllProducts")
	public List<ProductResponse> getAllProducts() {
		
		return productService.getAllProducts();
		
	}

}

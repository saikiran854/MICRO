package com.project.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.project.productservice.dto.ProductRequest;
import com.project.productservice.dto.ProductResponse;
import com.project.productservice.entities.Product;
import com.project.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public void insertProduct(ProductRequest prodreq) {
		
		Product product = new Product();
		product.setName(prodreq.getName());
		product.setDescription(prodreq.getDescription());
		product.setPrice(prodreq.getPrice());
		
		productRepository.save(product);
		
	}
	
	public List<ProductResponse> getAllProducts(){
		
		List<Product> products = productRepository.findAll();
		System.out.println("All the products available are :: " + products);
		System.out.println("Product list is  :: " + new Gson().toJson(products));
		
		return products.stream().map(prod -> mapToProductResponse(prod)).toList();
	}

	private ProductResponse mapToProductResponse(Product prod) {
		
		ProductResponse productResponse = new ProductResponse();
		productResponse.setName(prod.getName());
		productResponse.setDescription(prod.getDescription());
		productResponse.setPrice(prod.getPrice());
		return productResponse;
	}

}

package com.project.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.inventoryservice.dto.InventoryResponse;
import com.project.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventooryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/")
	public String message() {
		return "Hello";
	}
	
	@GetMapping("/isInStock")
	public Boolean isInStock(@RequestParam("ske-code") List<String> skeucode ) throws Exception {
		return inventoryService.isInStock(skeucode);
	}

}

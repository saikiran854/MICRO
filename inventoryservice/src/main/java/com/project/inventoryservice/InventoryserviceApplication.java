package com.project.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.project.inventoryservice.model.Inventory;
import com.project.inventoryservice.repository.InventoryRepo;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryserviceApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner loadData(InventoryRepo inventoryRepo) {
//		
//		return args -> {
//			
//			Inventory inv1 = new Inventory();
//			inv1.setSkeuCode("iphone 15");
//			inv1.setQty(100);
//			
//			Inventory inv2 = new Inventory();
//			inv2.setSkeuCode("samsung s24");
//			inv2.setQty(200);
//			
//			inventoryRepo.save(inv1);
//			inventoryRepo.save(inv2);
//			
//			
//		};
		
//	}

}

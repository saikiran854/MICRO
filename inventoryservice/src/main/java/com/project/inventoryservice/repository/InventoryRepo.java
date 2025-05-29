package com.project.inventoryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.inventoryservice.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long> {
	
	List<Inventory> findBySkeuCodeIn(List<String> skeucode);

}

package com.project.inventoryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.inventoryservice.dto.InventoryResponse;
import com.project.inventoryservice.model.Inventory;
import com.project.inventoryservice.repository.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo inventoryRepo;
	
	public Boolean isInStock(List<String> skeucode) throws Exception {
		
		System.out.println("Wait started!!!");
		Thread.sleep(10000);
		System.out.println("Wait ended!!!");
		
		List<Inventory> invlist = inventoryRepo.findBySkeuCodeIn(skeucode);
		if(invlist != null) {
			List<InventoryResponse> invResplist = invlist.stream().map(inv -> mapToInventoryResponse(inv)).toList();
			return invResplist.stream().allMatch(i -> i.getQty() > 0);
		}
		return false;
	}

	private InventoryResponse mapToInventoryResponse(Inventory inv) {
		
		InventoryResponse invresp = new InventoryResponse();
		invresp.setSkeuCode(inv.getSkeuCode());
		invresp.setQty(inv.getQty());
		return invresp;
	}

}

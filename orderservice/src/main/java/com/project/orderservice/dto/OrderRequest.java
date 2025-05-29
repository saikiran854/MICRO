package com.project.orderservice.dto;

import java.util.List;

public class OrderRequest {
	
	private List<OrderItemsDTO> OrderItemsDTOList;

	public List<OrderItemsDTO> getOrderItemsDTOList() {
		return OrderItemsDTOList;
	}

	public void setOrderItemsDTOList(List<OrderItemsDTO> orderItemsDTOList) {
		OrderItemsDTOList = orderItemsDTOList;
	}
	
	
}

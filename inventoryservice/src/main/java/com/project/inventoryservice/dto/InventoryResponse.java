package com.project.inventoryservice.dto;

public class InventoryResponse {
	
	private String skeuCode;
	private Integer qty;
	
	
	public String getSkeuCode() {
		return skeuCode;
	}
	public void setSkeuCode(String skeuCode) {
		this.skeuCode = skeuCode;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}

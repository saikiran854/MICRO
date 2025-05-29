package com.project.orderservice.dto;

public class OrderItemsDTO {
	
	private Long id;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
	private String skeucode;
	private String price;
	private int qty;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkeucode() {
		return skeucode;
	}
	public void setSkeucode(String skeucode) {
		this.skeucode = skeucode;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}

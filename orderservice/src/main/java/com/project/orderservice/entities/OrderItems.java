package com.project.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "orderitemGen")
	@SequenceGenerator(name = "orderitemGen", sequenceName = "SEQ_ORDERITEMS" , allocationSize = 1)
	private Long id;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
	private String skeucode;
	private String price;
	private int qty;
	
	
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

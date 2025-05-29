package com.project.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "INVENTORY")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "invenIdGen")
	@SequenceGenerator(name = "invenIdGen" , sequenceName = "SEQ_INVENTORY_ID" , allocationSize = 1 )
	private Long id;
	
	private String skeuCode;
	private Integer qty;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

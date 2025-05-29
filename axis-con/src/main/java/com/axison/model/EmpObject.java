package com.axison.model;

import jakarta.validation.constraints.NotEmpty;

public class EmpObject {
	
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	private String eid;
	private String salary;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "EmpObject [name=" + name + ", eid=" + eid + ", salary=" + salary + ", company=" + company + "]";
	}
	
	
	

}

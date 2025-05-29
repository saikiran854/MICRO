package com.axison.conroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.axison.entities.Employee;
import com.axison.model.EmpObject;
import com.axison.repos.EmployeeRepo;

import jakarta.validation.Valid;
//import com.google.gson.Gson;


@RestController
@RequestMapping("/axisboot")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping("/checkStatus")
	public String checkStatus() {
		System.out.println("Welcome");
		return "Welcome";
	}
	
//	@PostMapping("/createEmployee")
//	public String createEmployee(@RequestBody @Valid EmpObject emp , BindingResult bindingResult) {
//		
//		System.out.println("Employee req::" + emp.toString() );
//		List<String> errorMessages = new ArrayList<String>();
//		if(bindingResult.hasErrors()) {
//			for(ObjectError objErr : bindingResult.getAllErrors()) {
//				errorMessages.add(objErr.getDefaultMessage());
//			}
//			System.out.println("Validation error::" + String.join(",", errorMessages));
////			return String.join(",", errorMessages);
//		}
//		Employee employee = new Employee();
//		employee.setCompany("Microsoft");
//		employee.setSalary("4500000");
//		employee.setEid("100");
//		employee.setName("Saikiran");
//		try {
//			int x = 1/0;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Exception::" + e);
//			return e.getMessage();
//			
//		}
//		employeeRepo.save(employee);
//		return "Employee created";
//	}
	
	
	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody EmpObject emp ) {
		
		System.out.println("Employee req::" + emp.toString() );
		List<String> errorMessages = new ArrayList<String>();
		Errors error = new BeanPropertyBindingResult(emp, "emp");
		if(!StringUtils.hasText(emp.getEid())) {
			error.rejectValue("Eid", "required", "Eid cannot be empty");
		}
		if(!StringUtils.hasText(emp.getCompany())) {
			error.rejectValue("Company", "required", "Company cannot be empty");
		}
		if(!StringUtils.hasText(emp.getName())) {
			error.rejectValue("Name", "required", "Name cannot be empty");
		}
		if(!StringUtils.hasText(emp.getSalary())) {
			error.rejectValue("Salary", "required", "Salary cannot be empty");
		}
		if(error.hasErrors()) {
			for(FieldError e : error.getFieldErrors()) {
				errorMessages.add(e.getDefaultMessage());
				System.out.println("Filed::" + e.getField() + "result::" + e.getRejectedValue() + "message::" + e.getDefaultMessage());;
			}
			return String.join(",", errorMessages);
		}
//		if(bindingResult.hasErrors()) {
//			for(ObjectError objErr : bindingResult.getAllErrors()) {
//				errorMessages.add(objErr.getDefaultMessage());
//			}
//			System.out.println("Validation error::" + String.join(",", errorMessages));
//			
//			for(FieldError fieldError : bindingResult.getFieldErrors()) {
//				System.out.println("Filed::" + fieldError.getField() + "RejectValue::" + fieldError.getRejectedValue()
//						+ "message::" + fieldError.getDefaultMessage());
//			}
//			
//			return String.join(",", errorMessages);
//		}
		Employee employee = new Employee();
		employee.setCompany("Microsoft");
		employee.setSalary("4500000");
		employee.setEid("100");
		employee.setName("Saikiran");
		try {
			int x = 1/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception::" + e);
			return e.getMessage();
			
		}
		employeeRepo.save(employee);
		return "Employee created";
	}
	

}

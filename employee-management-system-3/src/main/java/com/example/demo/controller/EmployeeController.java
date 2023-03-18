package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	} 

	//build create employee rest api
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	
	//build get all employees REST API
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping("/{eID}")
	public Employee getEmployee(@PathVariable("eID") String eID){

		long l=Long.parseLong(eID);  
		return employeeService.getEmployee(l);
		
	}
	
	// delete employee
	
	@DeleteMapping("{eID}")
	public void deleteEmployee(@PathVariable("eID") String eID){

		System.out.print("you have entered the delete");
		long l=Long.parseLong(eID);  
		employeeService.deleteEmployee(l);
		
	}
	
}

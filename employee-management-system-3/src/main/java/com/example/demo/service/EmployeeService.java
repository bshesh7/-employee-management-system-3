package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	Employee getEmployee(long ID);
	void deleteEmployee(long ID);
	
	List<Employee> getAllEmployees();

}

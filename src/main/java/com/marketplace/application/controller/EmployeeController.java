package com.marketplace.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.application.entity.Employee;
import com.marketplace.application.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
		
	@PostMapping("/addemployees")
		public List<Employee> addEmployees(@RequestBody List<Employee> employees){
			return employeeService.saveEmployees(employees);
		}
	
	@GetMapping("/employees")
	public List<Employee> findEmployees(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}

}

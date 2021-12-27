package com.marketplace.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.application.entity.Employee;
import com.marketplace.application.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employee) {
		return employeeRepository.saveAll(employee);
	}
	
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(int id){
		return employeeRepository.findById(id).orElse(null);
	}
	
	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Employee Removed" + id;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee exitisting = employeeRepository.findById(employee.getEmpId()).orElse(null);
		exitisting.setFirstName(employee.getFirstName());
		exitisting.setLastName(employee.getLastName());
		exitisting.setMobileNumber(employee.getMobileNumber());
		
		return employeeRepository.save(exitisting);
	}
}

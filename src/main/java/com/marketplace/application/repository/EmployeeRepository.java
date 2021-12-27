package com.marketplace.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

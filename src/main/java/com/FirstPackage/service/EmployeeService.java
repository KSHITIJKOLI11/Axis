package com.FirstPackage.service;

import java.util.List;

import com.FirstPackage.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
	Employee updateEmployeeById(int id, Employee employee);
	String deleteEmployeeById(int id);
	
}

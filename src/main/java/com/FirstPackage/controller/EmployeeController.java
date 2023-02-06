package com.FirstPackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FirstPackage.entity.Employee;
import com.FirstPackage.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getemployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@ExceptionHandler(ArithmeticException.class)
	public String myException() {
		return"somethings went wrong";
	}
	
//	@PutMapping("/employee/{id}")
//	public Employee updateEmployeeById(@PathVariable int id,@RequestBody Employee employee){
//        return employeeService.updateEmployeeById(id, employee);
//	    }
//    @DeleteMapping("/employee/{id}")
//	public String deleteEmployeeById(@PathVariable int id){
//    	return employeeService.deleteEmployeeById(id);
//	    }
	
}

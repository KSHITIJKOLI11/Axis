package com.FirstPackage.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FirstPackage.entity.Employee;
import com.FirstPackage.exception.IdNotFoundException;
import com.FirstPackage.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
	  Optional<Employee> emp= employeeRepository.findById(id);
	  
	  if(emp.isPresent())
		  return emp.get();
	  else
		  throw  new IdNotFoundException("no id present");
		  
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}

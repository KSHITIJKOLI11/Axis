package com.FirstPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;


import com.FirstPackage.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
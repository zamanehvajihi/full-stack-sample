package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

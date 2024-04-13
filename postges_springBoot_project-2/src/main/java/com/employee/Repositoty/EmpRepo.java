package com.employee.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}

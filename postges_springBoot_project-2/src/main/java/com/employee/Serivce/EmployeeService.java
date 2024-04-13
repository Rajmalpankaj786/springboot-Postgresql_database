package com.employee.Serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.Employee;
import com.employee.Repositoty.EmpRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepo empRepo;
	
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}
	
	public List<Employee> viewAllEmployee(){
		return empRepo.findAll();
	}
}

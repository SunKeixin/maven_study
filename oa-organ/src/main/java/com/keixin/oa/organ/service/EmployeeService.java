package com.keixin.oa.organ.service;

import com.keixin.oa.organ.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public Employee findEmployeeById(Long id);
	
}

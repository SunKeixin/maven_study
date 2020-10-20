package com.keixin.oa.organ.mapper;

import com.keixin.oa.organ.model.Employee;

public interface EmployeeMapper {
	
	public void addEmployee(Employee employee);
	
	public Employee findEmployeeById(Long id);
	
}

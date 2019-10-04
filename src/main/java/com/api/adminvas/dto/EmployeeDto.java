package com.api.adminvas.dto;

import com.api.adminvas.domain.Employee;

public class EmployeeDto extends Dto {

	private Employee employee;
	private Employee employeeList;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Employee employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
}

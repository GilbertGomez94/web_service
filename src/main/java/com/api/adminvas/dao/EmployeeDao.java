package com.api.adminvas.dao;

import com.api.adminvas.domain.Employee;

public class EmployeeDao {
	
	private Employee employee;
	private Employee[] employeeList;

	public Employee getEmployee(Employee employee) throws Exception {
		return employee;
	}

	public Employee[] getEmployeeList() throws Exception {
		return employeeList;
	}

	public void setEmployeeList(Employee[] employeeList) {
		this.employeeList = employeeList;
	}
	
	
	

}

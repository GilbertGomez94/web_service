package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.EmployeeDao;
import com.api.adminvas.domain.Employee;
import com.api.adminvas.dto.EmployeeDto;


public class EmployeeManagement {
	
	private Employee _employee;
	private EmployeeDao dao = new EmployeeDao();
    private EmployeeDto dto = new EmployeeDto();
	
	public EmployeeDto readEmployee () {
		
		
		try {		
		
			dto.setEmployeeList(dao.getEmployeeList());
			dto.setMessage(Constants.FOUND);		
		}catch (Exception e) {
			dto.setMessage(Constants.NOT_FOUND);
		}
		return dto;
	}
	
	public EmployeeDto insertEmployee (Employee employee) {
		_employee = new Employee();
		
		try {
			_employee = dao.getEmployee(employee);
		
			dto.setEmployee(_employee);
			dto.setMessage(Constants.FOUND);		
		}catch (Exception e) {
			dto.setMessage(Constants.NOT_FOUND);
		}
		return dto;
	}
	
	public EmployeeDto updateEmployee (Employee employee) {
		_employee = new Employee();
		
		try {
			_employee = dao.getEmployee(employee);
		
			dto.setEmployee(_employee);
			dto.setMessage(Constants.FOUND);		
		}catch (Exception e) {
			dto.setMessage(Constants.NOT_FOUND);
		}
		return dto;
	}

}

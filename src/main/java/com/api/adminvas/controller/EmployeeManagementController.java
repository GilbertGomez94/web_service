package com.api.adminvas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.EmployeeManagement;
import com.api.adminvas.domain.Employee;
import com.api.adminvas.dto.EmployeeDto;

@RestController
@RequestMapping("employee")
public class EmployeeManagementController {
	
	private EmployeeManagement employeeManagement = new EmployeeManagement();
	private EmployeeDto dto = new EmployeeDto();
	
	@GetMapping(value = "ReadEmployee",
			produces  = {
					MediaType.APPLICATION_JSON_VALUE
			})
	public ResponseEntity<EmployeeDto> readEmployee(){
		
		return new ResponseEntity(employeeManagement.readEmployee(), HttpStatus.resolve(200));
	}
	
	 @PutMapping( value = "InsertContract/{name}/{position}/{area}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<EmployeeDto> insertEmployee(@PathVariable String name,
	    													@PathVariable String position,
															@PathVariable String area){
	    	;
	        
	    	Employee employee = new Employee();
	    	employee.setName(name);
	    	employee.setPosition(position);
	    	employee.setArea(area);
	    	return new ResponseEntity(employeeManagement.insertEmployee(employee), HttpStatus.resolve(200));
	    	
	    }
	 
	 @PostMapping( value = "UpdateContract/{name}/{position}/{area}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	 public ResponseEntity<EmployeeDto> updateContract(@PathVariable String name,
														@PathVariable String position,
														@PathVariable String area){
		 ;

		 	Employee employee = new Employee();
	    	employee.setName(name);
	    	employee.setPosition(position);
	    	employee.setArea(area);
	    	return new ResponseEntity(employeeManagement.updateEmployee(employee), HttpStatus.resolve(200));
	    	
	    }

}

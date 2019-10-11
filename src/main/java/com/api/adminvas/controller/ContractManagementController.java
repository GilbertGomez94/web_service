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

import com.api.adminvas.business.ContractManagement;
import com.api.adminvas.domain.Contract;
import com.api.adminvas.dto.ContractDto;


@RestController
@RequestMapping("contract")
public class ContractManagementController {
	
	private ContractManagement contractManament = new ContractManagement();
	private ContractDto dto = new ContractDto();
	
	@GetMapping(value = "ReadContract/{provider}",
			produces  = {
					MediaType.APPLICATION_JSON_VALUE
			})
	public ResponseEntity<ContractDto> readContract(@PathVariable String provider){
		
		;
		Contract contract = new Contract();
		contract.setProvider(provider);
		
		return new ResponseEntity(contractManament.readContract(contract), HttpStatus.resolve(200));
	}
	
	 @PutMapping( value = "InsertContract/{provider}/{percent}/{type}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<ContractDto> insertContract(@PathVariable String provider,
	    													@PathVariable int percent,
															@PathVariable String type){
	    	;
	        
	    	Contract contract = new Contract();
	    	contract.setProvider(provider);
	    	contract.setPercent(percent);
	    	contract.setType(type);
	    	return new ResponseEntity(contractManament.insertContract(contract), HttpStatus.resolve(200));
	    	
	    }
	 
	 @PostMapping( value = "UpdateContract/{provider}/{percent}/{type}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	 public ResponseEntity<ContractDto> updateContract(@PathVariable String provider,
			 											@PathVariable int percent,
														@PathVariable String type){
		 ;

			Contract contract = new Contract();
			contract.setProvider(provider);
			contract.setPercent(percent);
			contract.setType(type);	
	    	return new ResponseEntity(contractManament.updateContract(contract), HttpStatus.resolve(200));
	    	
	    }

}

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

import com.api.adminvas.business.BasicTariffManagement;
import com.api.adminvas.domain.BasicTariff;
import com.api.adminvas.dto.BasicTariffDto;

@RestController
@RequestMapping("basicTariff")
public class BasicTariffManagementController {
	
	private BasicTariffManagement basicTariffManament = new BasicTariffManagement();
	private BasicTariffDto dto = new BasicTariffDto();
	
	@GetMapping(value = "readBasicTariff",
			produces  = {
					MediaType.APPLICATION_JSON_VALUE
			})
	public ResponseEntity<BasicTariffDto> readBasicTariff(){
		
		return new ResponseEntity(basicTariffManament.readBasicTariff(), HttpStatus.resolve(200));
	}
	
	 @PutMapping( value = "InsertAddendum",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<BasicTariffDto> insertBasicTariff(@PathVariable float amount,
																@PathVariable String trafitt,
																@PathVariable boolean valid){
	    	;
	    	BasicTariff basicTariff = new BasicTariff();
	    	basicTariff.setAmount(amount);
	    	basicTariff.setTrafitt(trafitt);
	    	basicTariff.setValid(valid);    	
	    	return new ResponseEntity(basicTariffManament.insertBasicTariff(basicTariff), HttpStatus.resolve(200));
	    	
	    }
	 
	 @PostMapping(value = "UpdateAddendum",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<BasicTariffDto> updateBasicTariff(@PathVariable float amount,
																@PathVariable String trafitt,
																@PathVariable boolean valid){
	    	;
	    	BasicTariff basicTariff = new BasicTariff();
	    	basicTariff.setAmount(amount);
	    	basicTariff.setTrafitt(trafitt);
	    	basicTariff.setValid(valid);    	
	    	return new ResponseEntity(basicTariffManament.updateBasicTariff(basicTariff), HttpStatus.resolve(200));
	    	
	    } 

}

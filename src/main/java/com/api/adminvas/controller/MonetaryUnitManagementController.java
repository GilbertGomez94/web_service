package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.MonetaryUnitManagement;
import com.api.adminvas.domain.MonetaryUnit;
import com.api.adminvas.dto.MonetaryUnitDto;

@RestController
@RequestMapping("MonetaryUnit")
public class MonetaryUnitManagementController {
	
	private MonetaryUnitManagement monetaryUnitManagement = new MonetaryUnitManagement();
    private MonetaryUnitDto dto = new MonetaryUnitDto();

    @GetMapping(value = "ReadMonetaryUnit",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<MonetaryUnitDto> readMonetaryUnit(){
    	
    	MonetaryUnit monetaryUnit = new MonetaryUnit();
    	        
        return new ResponseEntity(monetaryUnitManagement.readMonetaryUnit(monetaryUnit) , HttpStatus.resolve(200));
        
    }
    
    @PostMapping( value = "InsertConfigSistem/{characteristic}/{value}",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<MonetaryUnitDto> insertConfigSistemManagement(@PathVariable String name,	            										
            															@PathVariable String notation,
            															@PathVariable Date validDate){
    	;
        
    	MonetaryUnit monetaryUnit = new MonetaryUnit();
    	monetaryUnit.setName(name);
    	monetaryUnit.setNotation(notation);
    	monetaryUnit.setValidDate(validDate);
    	
    	
    	return new ResponseEntity(monetaryUnitManagement.insertMonetaryUnit(monetaryUnit), HttpStatus.resolve(200));
    	
    }
    
    @PutMapping( value = "UpdateConfigSistem/{characteristic}/{value}",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<MonetaryUnitDto> UpdateConfigSistemManagement(@PathVariable String name,	            										
																		@PathVariable String notation,
																		@PathVariable Date validDate){
    	;
        
    	MonetaryUnit monetaryUnit = new MonetaryUnit();
    	monetaryUnit.setName(name);
    	monetaryUnit.setNotation(notation);
    	monetaryUnit.setValidDate(validDate);
    	
    	
    	return new ResponseEntity(monetaryUnitManagement.updateMonetaryUnit(monetaryUnit), HttpStatus.resolve(200));
    	
    }

}

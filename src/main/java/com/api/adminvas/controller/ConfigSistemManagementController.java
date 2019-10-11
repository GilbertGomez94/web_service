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
import com.api.adminvas.business.ConfigSistemManagement;
import com.api.adminvas.domain.ConfigSistem;
import com.api.adminvas.dto.ConfigSistemDto;


@RestController
@RequestMapping("configSistem")
public class ConfigSistemManagementController {

		
		private ConfigSistemManagement configSistemManagement = new ConfigSistemManagement();
	    private ConfigSistemDto dto = new ConfigSistemDto();

	    @GetMapping(value = "ReadConfigSistem",
	            produces = {
	                    MediaType.APPLICATION_JSON_VALUE
	            })
	    public ResponseEntity<ConfigSistemDto> readBlackList(){
	    	        
	        return new ResponseEntity(configSistemManagement.readConfigSistem() , HttpStatus.resolve(200));
	        
	    }
	    
	    @PostMapping( value = "InsertConfigSistem/{characteristic}/{value}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<ConfigSistemDto> insertConfigSistemManagement(@PathVariable String characteristic,	            										
	            															@PathVariable String value){
	    	;
	        
	    	ConfigSistem configSistem = new ConfigSistem();
	    	configSistem.setCharacteristic(characteristic);
	    	configSistem.setValue(value);
	    	
	    	
	    	return new ResponseEntity(configSistemManagement.insertConfigSistem(configSistem), HttpStatus.resolve(200));
	    	
	    }
	    
	    @PutMapping( value = "UpdateConfigSistem/{characteristic}/{value}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<ConfigSistemDto> UpdateConfigSistemManagement(@PathVariable String characteristic,	            										
	            															@PathVariable String value){
	    	;
	        
	    	ConfigSistem configSistem = new ConfigSistem();
	    	configSistem.setCharacteristic(characteristic);
	    	configSistem.setValue(value);
	    	
	    	
	    	return new ResponseEntity(configSistemManagement.UpdateConfigSistem(configSistem), HttpStatus.resolve(200));
	    	
	    }

}

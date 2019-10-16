package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.ShortCodeManagement;
import com.api.adminvas.domain.ShortCode;
import com.api.adminvas.dto.ShortCodeDto;

@RestController
@RequestMapping("shortCode")
public class ShortCodeManagementController {
	
	private ShortCodeManagement shortCodeManagement = new ShortCodeManagement();
    private ShortCodeDto dto = new ShortCodeDto();

	
	 @GetMapping(value = "readShortCode/{provider}/{typeRequest}",
	            produces = {
	            		
	                    MediaType.APPLICATION_JSON_VALUE
	            })
	    public ResponseEntity<ShortCodeDto> readShortCode(@PathVariable String provider,
	    												  @PathVariable String typeRequest){
	    	
		 ShortCode shortCode = new ShortCode();
	    	        
	        return new ResponseEntity(shortCodeManagement.readShortCode(shortCode), HttpStatus.resolve(200));
	        
	    }
	    
	    @PostMapping( value = "InsertShortCode/{status}/{dateRequest}/{cost}/{shortCode}/{typeRequest}/{provider}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<ShortCodeDto> insertShortCode(@PathVariable String SC,	            										
	            										@PathVariable String typeService,
	            										@PathVariable String ESME,
	            										@PathVariable String productname,
	            										@PathVariable String description,
	            										@PathVariable int approxtraffic,
	            										@PathVariable String observation){
	    	;
	        
	    	ShortCode shortCode = new ShortCode();
	    	shortCode.setShortCode(SC);
	    	shortCode.setTypeService(typeService);
	    	shortCode.setESME(ESME);
	    	shortCode.setProductname(productname);
	    	shortCode.setDescription(description);
	    	shortCode.setApproxtraffic(approxtraffic);
	    	shortCode.setObservation(observation);
	    		    	
	    	return new ResponseEntity(shortCodeManagement.insertShortCode(shortCode), HttpStatus.resolve(200));
	    	
	    }

}

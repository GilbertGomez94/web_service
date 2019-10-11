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

import com.api.adminvas.business.RequestManagement;
import com.api.adminvas.domain.Request;
import com.api.adminvas.dto.RequestDto;

@RestController
@RequestMapping("Request")
public class RequestManagementController {
	
	private RequestManagement requestManagement = new RequestManagement();
    private RequestDto dto = new RequestDto();

    @GetMapping(value = "readAllRequest",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<RequestDto> readAllRequest(){
    	
    	Request request = new Request();
    	        
        return new ResponseEntity(requestManagement.readAllRequest() , HttpStatus.resolve(200));
        
    }
    
    @GetMapping(value = "readSomeRequest/{provider}/{typeRequest}",
            produces = {
            		
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<RequestDto> readSomeRequest(@PathVariable String provider,
    												  @PathVariable String typeRequest){
    	
    	Request request = new Request();
    	        
        return new ResponseEntity(requestManagement.readSomeRequest(request), HttpStatus.resolve(200));
        
    }
    
    @PostMapping( value = "InsertRequest/{status}/{dateRequest}/{cost}/{shortCode}/{typeRequest}/{provider}",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<RequestDto> insertRequest(@PathVariable String status,	            										
            										@PathVariable Date dateRequest,
            										@PathVariable int cost,
            										@PathVariable int shortCode,
            										@PathVariable String typeRequest,
            										@PathVariable String provider){
    	;
        
    	Request request = new Request();
    	request.setStatus(status);
    	request.setDateRequest(dateRequest);
    	request.setCost(cost);
    	request.setShortCode(shortCode);
    	request.setTypeRequest(typeRequest);
    	request.setProvider(provider);
    	
    	
    	return new ResponseEntity(requestManagement.insertRequest(request), HttpStatus.resolve(200));
    	
    }

}

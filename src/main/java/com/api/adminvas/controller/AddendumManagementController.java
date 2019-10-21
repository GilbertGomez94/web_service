package com.api.adminvas.controller;

import org.springframework.http.MediaType;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.AddendumManagement;
import com.api.adminvas.domain.Addendum;
import com.api.adminvas.domain.BlackList;
import com.api.adminvas.dto.AddendumDto;
import com.api.adminvas.dto.BlackListDto;

@RestController
@RequestMapping("/addendum")
public class AddendumManagementController {
	
	private AddendumManagement addendumManament = new AddendumManagement();
	private AddendumDto dto = new AddendumDto();
	
	@GetMapping(value = "/ReadAddendum",
			produces  = {
					MediaType.APPLICATION_JSON_VALUE
			})
	public ResponseEntity<AddendumDto> readAddendum(){
		
		return new ResponseEntity(addendumManament.readAddendum(), HttpStatus.resolve(200));
	}
	
	 @PutMapping( value = "InsertAddendum/{percent}/{description}/{MTXMO}/{type}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<AddendumDto> insertAddendum(@PathVariable int percent,
															@PathVariable String description,
															@PathVariable int MTXMO,
															@PathVariable String type){
	    	;
	        
	    	Addendum addendum = new Addendum();
	    	addendum.setPercent(percent);
	    	addendum.setDescription(description);
	    	addendum.setMTXMO(MTXMO);
	    	addendum.setType(type);	    	
	    	return new ResponseEntity(addendumManament.insertAddendum(addendum), HttpStatus.resolve(200));
	    	
	    }
	 
	 @PostMapping( value = "UpdateAddendum/{percent}/{description}/{MTXMO}/{type}",
	    		produces = {
	    				MediaType.APPLICATION_JSON_VALUE
	    		})
	    public ResponseEntity<AddendumDto> updateAddendum(@PathVariable int percent,
															@PathVariable String description,
															@PathVariable int MTXMO,
															@PathVariable String type){
	    	;
	        
	    	Addendum addendum = new Addendum();
	    	addendum.setPercent(percent);
	    	addendum.setDescription(description);
	    	addendum.setMTXMO(MTXMO);
	    	addendum.setType(type);	    	
	    	return new ResponseEntity(addendumManament.updateAddendum(addendum), HttpStatus.resolve(200));
	    	
	    }

}

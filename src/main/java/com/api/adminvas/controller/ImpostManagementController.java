package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.adminvas.business.ImpostManagement;
import com.api.adminvas.domain.Impost;
import com.api.adminvas.dto.ImpostDto;


@RestController
@RequestMapping("ImpostManagement")
public class ImpostManagementController {
	
	private ImpostManagement impostManagement = new ImpostManagement();
	private ImpostDto dto = new ImpostDto();
	
	
	 @GetMapping(value = "Read_impost/{name}/{percent}",
	            produces = {
	                    MediaType.APPLICATION_JSON_VALUE
	            })
	    public ResponseEntity<ImpostDto> createImpost(@PathVariable String name,
	                                               	  @PathVariable int percent,
	                                               	  @PathVariable Date validDate,
	                                               	  @PathVariable Date closingDate,
	                                               	  @PathVariable boolean valid){
	        Impost impost = new Impost();
	        impost.setName(name);
	        impost.setPercent(percent);
	        impost.setValidDate(validDate);
	        impost.setClosingDate(closingDate);
	        impost.setValid(valid);
	        
	        return new ResponseEntity(impostManagement.ReadImpost(impost), HttpStatus.resolve(200));
	    }

}

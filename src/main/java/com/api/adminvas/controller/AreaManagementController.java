package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.AreaManagement;
import com.api.adminvas.domain.Area;
import com.api.adminvas.dto.AreaDto;


@RestController
@RequestMapping("area")
public class AreaManagementController {
	
	private AreaManagement areaManagement = new AreaManagement();
    private AreaDto dto = new AreaDto();

    @GetMapping(value = "ReadArea",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<AreaDto> readArea(){
    	        
        return new ResponseEntity(areaManagement.readArea() , HttpStatus.resolve(200));
        
    }
    
 

}

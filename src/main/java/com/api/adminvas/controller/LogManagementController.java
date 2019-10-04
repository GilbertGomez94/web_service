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

import com.api.adminvas.business.LogManagement;
import com.api.adminvas.domain.Log;
import com.api.adminvas.dto.LogDto;
import com.api.adminvas.dto.UserDto;

@RestController
@RequestMapping("Log")
public class LogManagementController {
	
	private LogManagement logMagnagement = new LogManagement();
	private LogDto dto = new LogDto();
	
	@GetMapping(value = "readLog",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<LogDto> ReadLog(){
     
        return new ResponseEntity(logMagnagement.ReadLog(), HttpStatus.resolve(200));
    }
	
	
	
	
	@PutMapping(value = "insertLog/{action}/{dateAction}/{Admin}/{macAddress}",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<LogDto> InsertLog(@PathVariable String action,
                                          @PathVariable Date dateAction,
                                          @PathVariable String Admin,
                                          @PathVariable String macAddress){
        Log log = new Log();
        log.setAction(action);
        log.setDateAction(dateAction);
        log.setAdmin(Admin);
        log.setMacAddress(macAddress);
        
        return new ResponseEntity(logMagnagement.insertLog(log), HttpStatus.resolve(200));
    }
	
	
	

}

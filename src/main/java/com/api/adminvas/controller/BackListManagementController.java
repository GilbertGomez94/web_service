package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.BlackListManagement;
import com.api.adminvas.domain.BlackList;
import com.api.adminvas.dto.BlackListDto;


@RestController
@RequestMapping("blackList")
public class BackListManagementController {
	
	private BlackListManagement blackListManagement = new BlackListManagement();
    private BlackListDto dto = new BlackListDto();

    @GetMapping(value = "ReadBlackList",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<BlackListDto> readBlackList(){
    	        
        return new ResponseEntity(blackListManagement.readBlackList() , HttpStatus.resolve(200));
        
    }
    
    @PutMapping( value = "InsertBlackList",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<BlackListDto> insertBlacklist(@PathVariable int shortCodeBlocked,
            											@PathVariable String reason,
            											@PathVariable Date date,
            											@PathVariable String admin){
    	;
        
        BlackList blackList = new BlackList();
        blackList.setShortCodeBlocked(shortCodeBlocked);
        blackList.setReason(reason);
        blackList.setDate(date);
        blackList.setAdmin(admin);
    	
    	return new ResponseEntity(blackListManagement.insertBlackList(blackList), HttpStatus.resolve(200));
    	
    }
    
    @DeleteMapping( value = "DeleteBlackList",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<BlackListDto> deleteBlacklist(@PathVariable int shortCodeBlocked){
    	;
        
        BlackList blackList = new BlackList();
        blackList.setShortCodeBlocked(shortCodeBlocked);
    	
    	return new ResponseEntity(blackListManagement.deleteBlackList(blackList), HttpStatus.resolve(200));
    	
    }
}

package com.api.adminvas.controller;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.adminvas.business.BlackListManagement;
import com.api.adminvas.domain.BlackList;
import com.api.adminvas.dto.BlackListDto;


@RestController
@RequestMapping("BlackList")
public class BackListManagementController {
	
	private BlackListManagement blackListManagement = new BlackListManagement();
    private BlackListDto dto = new BlackListDto();

    @GetMapping(value = "ReadBlackList",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<BlackListDto> readBlackList(@PathVariable String number,
                                               	      @PathVariable String reason,
                                                      @PathVariable Date date,
                                                      @PathVariable String Admin){
    	BlackList blackList = new BlackList();
        ;
        return new ResponseEntity(blackListManagement.readBlackList(blackList) , HttpStatus.resolve(200));
    }

}

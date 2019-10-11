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
import com.api.adminvas.business.ProviderManagement;
import com.api.adminvas.domain.Provider;
import com.api.adminvas.dto.ProviderDto;

@RestController
@RequestMapping("Provider")
public class ProviderManagementController {
	
	private ProviderManagement providerManagement = new ProviderManagement();
    private ProviderDto dto = new ProviderDto();

    @GetMapping(value = "ReadProvider",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<ProviderDto> readProvider(){
    	    	
    	        
        return new ResponseEntity(providerManagement.readProvider() , HttpStatus.resolve(200));
        
    }
    
    
    @GetMapping(value = "detailProvider",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<ProviderDto> detailProvider(@PathVariable String name){
    	
    	Provider provider = new Provider();
    	provider.setName(name);    	    	
    	        
        return new ResponseEntity(providerManagement.detailProvider(provider) , HttpStatus.resolve(200));
        
    }
    
    
    @PostMapping( value = "InsertProvider/{name}/{typeRif}/{rif}/{nit}/{address}/{interfaces}",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<ProviderDto> insertConfigSistemManagement(@PathVariable String name,	            										
            															@PathVariable char typeRif,
            															@PathVariable String rif,
            															@PathVariable String nit,
            															@PathVariable String address,
            															@PathVariable String[] interfaces){
    	;
        
    	Provider provider = new Provider();
    	provider.setName(name);
    	provider.setTypeRif(typeRif);
    	provider.setRif(rif);
    	provider.setNit(nit);
    	provider.setAddress(address);
    	provider.setInterfaces(interfaces);
    	
    	
    	return new ResponseEntity(providerManagement.insertProvider(provider), HttpStatus.resolve(200));
    	
    }
    
    @PutMapping( value = "UpdateProvider/{name}/{typeRif}/{rif}/{nit}/{address}/{interfaces}",
    		produces = {
    				MediaType.APPLICATION_JSON_VALUE
    		})
    public ResponseEntity<ProviderDto> UpdateProviderManagement(@PathVariable String name,	            										
																	@PathVariable char typeRif,
																	@PathVariable String rif,
																	@PathVariable String nit,
																	@PathVariable String address,
																	@PathVariable String[] interfaces){
    	;
        
    	Provider provider = new Provider();
    	provider.setName(name);
    	provider.setTypeRif(typeRif);
    	provider.setRif(rif);
    	provider.setNit(nit);
    	provider.setAddress(address);
    	provider.setInterfaces(interfaces);
    	
    	
    	return new ResponseEntity(providerManagement.insertProvider(provider), HttpStatus.resolve(200));
    	
    }

}

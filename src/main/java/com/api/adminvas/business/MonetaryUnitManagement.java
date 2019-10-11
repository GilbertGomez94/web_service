package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.MonetaryUnitDao;
import com.api.adminvas.domain.MonetaryUnit;
import com.api.adminvas.dto.MonetaryUnitDto;


public class MonetaryUnitManagement {
	
	private MonetaryUnit _monetaryUnit;
    private MonetaryUnitDao dao = new MonetaryUnitDao();
    private MonetaryUnitDto dto = new MonetaryUnitDto();

    public MonetaryUnitDto readMonetaryUnit(MonetaryUnit monetaryUnit ){
    	
        try {        	
            
            dto.setMonetaryUnit(dao.getMonetaryUnit(monetaryUnit));
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public MonetaryUnitDto insertMonetaryUnit(MonetaryUnit monetaryUnit ){
    	
        try {        	
            
            dto.setMonetaryUnit(dao.getMonetaryUnit(monetaryUnit));
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public MonetaryUnitDto updateMonetaryUnit(MonetaryUnit monetaryUnit ){
    	
        try {        	
            
            dto.setMonetaryUnit(dao.getMonetaryUnit(monetaryUnit));
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

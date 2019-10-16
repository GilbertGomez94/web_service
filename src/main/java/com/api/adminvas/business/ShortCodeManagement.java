package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.ShortCodeDao;
import com.api.adminvas.domain.ShortCode;
import com.api.adminvas.dto.ShortCodeDto;

public class ShortCodeManagement {
	
	private ShortCode _shortCode;
    private ShortCodeDao dao = new ShortCodeDao();
    private ShortCodeDto dto = new ShortCodeDto();
	
	public ShortCodeDto readShortCode(ShortCode shortCode) {
	 	_shortCode = new ShortCode();
        try{
            dto.setShortCodelist(dao.getShortCodelist());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;
	 
 }
 
 public ShortCodeDto insertShortCode(ShortCode shortCode) {
	 	_shortCode = new ShortCode();
        try{
        	dto.setShortCodelist(dao.getShortCodelist());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;
	 
 }

}

package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.AreaDao;
import com.api.adminvas.domain.Area;
import com.api.adminvas.dto.AreaDto;


public class AreaManament {
	
	private Area _area;
    private AreaDao dao = new AreaDao();
    private AreaDto dto = new AreaDto();

    public AreaDto readArea(){
        _area = new Area();
        try{
            
            dto.setArea(dao.getArea( ));
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

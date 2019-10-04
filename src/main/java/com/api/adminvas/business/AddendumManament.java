package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.AddendumDao;
import com.api.adminvas.domain.Addendum;
import com.api.adminvas.dto.AddendumDto;


public class AddendumManament {
	
	private Addendum _addendum;
    private AddendumDao dao = new AddendumDao();
    private AddendumDto dto = new AddendumDto();

    public AddendumDto readAddendum(){
        _addendum = new Addendum();
        try{
            
            dto.setAddendum(dao.getAddendum( ));
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

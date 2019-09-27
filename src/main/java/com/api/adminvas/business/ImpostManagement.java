package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.ImpostDao;
import com.api.adminvas.domain.Impost;
import com.api.adminvas.dto.ImpostDto;

public class ImpostManagement {
	
	private Impost _impost;
	private ImpostDao dao = new ImpostDao();
    private ImpostDto dto = new ImpostDto();
  
	public ImpostDto ReadImpost (Impost impost) {
		_impost = new Impost();
		
		try {
			_impost = dao.getImpost(impost);
		
			dto.setImpost(_impost);
			dto.setMessage(Constants.FOUND);		
		}catch (Exception e) {
			dto.setMessage(Constants.NOT_FOUND);
		}
		return dto;
	}

}

package com.api.adminvas.business;

import com.api.adminvas.Constants;

import com.api.adminvas.dao.ProviderContactDao;
import com.api.adminvas.domain.ProviderContact;
import com.api.adminvas.dto.ProviderContactDto;

public class ProviderContactManagement {

	private ProviderContact _ProviderContact;
	private ProviderContactDao dao = new ProviderContactDao();
	private ProviderContactDto dto = new ProviderContactDto();
	
	public ProviderContactDto ReadProviderContact(ProviderContact ProviderContact){
		_ProviderContact = new ProviderContact();
		
		try {
			
			_ProviderContact = dao.getProviderContact(_ProviderContact);
			
			dto.setProviderContact(_ProviderContact);
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	};
	
}

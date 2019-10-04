package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.ConfigSistemDao;
import com.api.adminvas.domain.ConfigSistem;
import com.api.adminvas.dto.ConfigSistemDto;


public class ConfigSistemManagement {
	
	private ConfigSistem _configSistem;
	private ConfigSistemDao dao = new ConfigSistemDao();
	private ConfigSistemDto dto = new ConfigSistemDto();
	
	public ConfigSistemDto readConfigSistem(){
		_configSistem = new ConfigSistem();
		
		try {
			
			_configSistem = dao.getConfigSistem(_configSistem);
			
			dto.setConfigSistem(_configSistem);
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}

	public ConfigSistemDto InsertConfigSistem(ConfigSistem configSistem){
		_configSistem = new ConfigSistem();
		
		try {
			
			_configSistem = dao.getConfigSistem(_configSistem);
			
			dto.setConfigSistem(_configSistem);
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}
	
	
	public ConfigSistemDto UpdateConfigSistem(ConfigSistem configSistem){
		_configSistem = new ConfigSistem();
		
		try {
			
			_configSistem = dao.getConfigSistem(_configSistem);
			
			dto.setConfigSistem(_configSistem);
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}
}

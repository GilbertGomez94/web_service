package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.LogDao;
import com.api.adminvas.domain.Log;
import com.api.adminvas.dto.LogDto;


public class LogManagement {
	
	private Log _log;
	private LogDao dao = new LogDao();
	private LogDto dto = new LogDto();
	
	public LogDto ReadLog(Log log){
		_log = new Log();
		
		try {
			
			_log = dao.getLog(_log);
			
			dto.setLog(_log);
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}

}

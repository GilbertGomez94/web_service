package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.LogDao;
import com.api.adminvas.domain.Log;
import com.api.adminvas.dto.LogDto;


public class LogManagement {
	
	private Log _log;
	private LogDao dao = new LogDao();
	private LogDto dto = new LogDto();
	
	public LogDto readLog(){
		_log = new Log();
		
		try {
						
			dto.setLog(dao.getLog(_log));
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}
	
	public LogDto insertLog(Log _log){
		_log = new Log();
		
		try {
						
			dto.setLog(dao.getLog(_log));
			dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
		}		
		return dto;
		
	}

}

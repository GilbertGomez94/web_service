package com.api.adminvas.dto;

import com.api.adminvas.domain.Log;

public class LogDto extends Dto {

	private Log log;
	private Log[] ListLog;

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public Log[] getListLog() {
		return ListLog;
	}

	public void setListLog(Log[] listLog) {
		ListLog = listLog;
	}
	
	
	
	
}

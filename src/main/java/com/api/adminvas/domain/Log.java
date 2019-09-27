package com.api.adminvas.domain;

import java.sql.Date;

public class Log {
	
	private String action;
	private Date dateAction;
	private String Admin;
	private String macAddress;
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public Date getDateAction() {
		return dateAction;
	}
	
	public void setDateAction(Date dateAction) {
		this.dateAction = dateAction;
	}
	
	public String getAdmin() {
		return Admin;
	}
	
	public void setAdmin(String admin) {
		Admin = admin;
	}
	
	public String getMacAddress() {
		return macAddress;
	}
	
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	 

}

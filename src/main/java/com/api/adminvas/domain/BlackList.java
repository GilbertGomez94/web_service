package com.api.adminvas.domain;

import java.sql.Date;

public class BlackList {

	private int shortCodeBlocked;
	private String reason;
	private Date date;
	private String Admin;
	
	
	public int getShortCodeBlocked() {
		return shortCodeBlocked;
	}
	
	public void setShortCodeBlocked(int shortCodeBlocked) {
		this.shortCodeBlocked = shortCodeBlocked;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getAdmin() {
		return Admin;
	}
	
	public void setAdmin(String admin) {
		Admin = admin;
	}
	
	
}

package com.api.adminvas.domain;

import java.sql.Date;

public class Provider extends User {
	
	private String name;
	private char typeRif;
	private String rif;
	private String nit;
	private String address;
	private Date lastloginDate;
	private int intents;
	private int status;
	private boolean valid;
	private Date validDate;
	private String[] interfaces;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getTypeRif() {
		return typeRif;
	}
	
	public void setTypeRif(char typeRif) {
		this.typeRif = typeRif;
	}
	
	public String getRif() {
		return rif;
	}
	
	public void setRif(String rif) {
		this.rif = rif;
	}
	
	public String getNit() {
		return nit;
	}
	
	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getLastloginDate() {
		return lastloginDate;
	}
	
	public void setLastloginDate(Date lastloginDate) {
		this.lastloginDate = lastloginDate;
	}
	
	public int getIntents() {
		return intents;
	}
	
	public void setIntents(int intents) {
		this.intents = intents;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String[] getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(String[] interfaces) {
		this.interfaces = interfaces;
	}
	
	
	
	

}

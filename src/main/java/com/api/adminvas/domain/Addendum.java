package com.api.adminvas.domain;

import java.sql.Date;

public class Addendum {
	private Date createDate;
	private Date closingDate;
	private int percent;
	private String Description;
	private int MTXMO;
	private String type;
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getMTXMO() {
		return MTXMO;
	}
	public void setMTXMO(int mTXMO) {
		MTXMO = mTXMO;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}

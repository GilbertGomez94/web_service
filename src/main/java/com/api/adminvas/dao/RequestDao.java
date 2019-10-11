package com.api.adminvas.dao;

import com.api.adminvas.domain.Request;

public class RequestDao {
	
	private Request request;
	private Request[] requestList;
	
	
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Request[] getRequestList() {
		return requestList;
	}
	public void setRequestList(Request[] requestList) {
		this.requestList = requestList;
	}
	
	

}

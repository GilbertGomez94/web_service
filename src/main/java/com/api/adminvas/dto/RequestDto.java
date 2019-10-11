package com.api.adminvas.dto;

import com.api.adminvas.domain.Request;

public class RequestDto extends Dto {
	
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

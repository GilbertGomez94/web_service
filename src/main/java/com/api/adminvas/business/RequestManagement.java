package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.RequestDao;
import com.api.adminvas.domain.Provider;
import com.api.adminvas.domain.Request;
import com.api.adminvas.dto.RequestDto;

public class RequestManagement {
	
	private Request _request;
    private RequestDao dao = new RequestDao();
    private RequestDto dto = new RequestDto();
	
	 public RequestDto readAllRequest(){
	        _request = new Request();
	        try{
	            dto.setRequestList(dao.getRequestList());
	            dto.setMessage(Constants.FOUND);
	        } catch (Exception e) {
	            dto.setMessage(Constants.NOT_FOUND);
	        }
	        return dto;

	    }
	 
	 public RequestDto readSomeRequest(Request request) {
		 	_request = new Request();
	        try{
	            dto.setRequestList(dao.getRequestList());
	            dto.setMessage(Constants.FOUND);
	        } catch (Exception e) {
	            dto.setMessage(Constants.NOT_FOUND);
	        }
	        return dto;
		 
	 }
	 
	 public RequestDto insertRequest(Request request) {
		 	_request = new Request();
	        try{
	            dto.setRequestList(dao.getRequestList());
	            dto.setMessage(Constants.FOUND);
	        } catch (Exception e) {
	            dto.setMessage(Constants.NOT_FOUND);
	        }
	        return dto;
		 
	 }

}

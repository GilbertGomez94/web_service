package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.BlackListDao;
import com.api.adminvas.domain.BlackList;
import com.api.adminvas.dto.BlackListDto;

public class BlackListManagement {
	
	private BlackList _blackList;
    private BlackListDao dao = new BlackListDao();
    private BlackListDto dto = new BlackListDto();

    public BlackListDto readBlackList(BlackList blackList){
        _blackList = new BlackList();
        try{
        	
        	_blackList = dao.getBlacklist(_blackList);
            
            dto.setBlacklist(_blackList);
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

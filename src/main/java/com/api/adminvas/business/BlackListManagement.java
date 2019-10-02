package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.BlackListDao;
import com.api.adminvas.domain.BlackList;
import com.api.adminvas.dto.BlackListDto;

public class BlackListManagement {
	
	
    private BlackListDao dao = new BlackListDao();
    private BlackListDto dto = new BlackListDto();

    public BlackListDto readBlackList(){
        try{            
            dto.setBlacklist(dao.getBlacklist());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public BlackListDto insertBlackList(BlackList blackList){
        try{            
            dto.setBlacklist(dao.getBlacklist());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public BlackListDto deleteBlackList(BlackList blackList){
        try{            
            dto.setBlacklist(dao.getBlacklist());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    

}

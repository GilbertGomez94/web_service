package com.api.adminvas.dao;

import com.api.adminvas.domain.BlackList;

public class BlackListDao {
	
	private BlackList blacklist;
	private BlackList[] listBlacList;
	
	public BlackList getBlacklist() throws Exception{
        return blacklist;
    }

	public BlackList[] getListBlacList() throws Exception {
		return listBlacList;
	}


}

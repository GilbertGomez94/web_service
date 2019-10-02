package com.api.adminvas.dto;

import com.api.adminvas.domain.BlackList;

public class BlackListDto extends Dto {
	
	private BlackList blacklist;
	private BlackList[] ListBlackList;

	public BlackList getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(BlackList blacklist) {
		this.blacklist = blacklist;
	}

	public BlackList[] getListBlackList() {
		return ListBlackList;
	}

	public void setListBlackList(BlackList[] listBlackList) {
		ListBlackList = listBlackList;
	}
	
	
	
	

}

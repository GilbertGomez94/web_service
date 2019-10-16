package com.api.adminvas.dao;

import com.api.adminvas.domain.ShortCode;

public class ShortCodeDao {
	
	private ShortCode shortCode;	
	private ShortCode[] shortCodelist;

	public ShortCode getShortCode() {
		return shortCode;
	}

	public void setShortCode(ShortCode shortCode) {
		this.shortCode = shortCode;
	}

	public ShortCode[] getShortCodelist() {
		return shortCodelist;
	}

	public void setShortCodelist(ShortCode[] shortCodelist) {
		this.shortCodelist = shortCodelist;
	}
	
	

}

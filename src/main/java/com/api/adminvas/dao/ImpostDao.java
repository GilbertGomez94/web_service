package com.api.adminvas.dao;

import com.api.adminvas.domain.Impost;

public class ImpostDao {
	
	private Impost impost;
	private Impost[] impostList;
	
	public Impost getImpost ( Impost impost) throws Exception {
		
		return impost;		
	}

	public Impost getImpost() {
		return impost;
	}

	public void setImpost(Impost impost) {
		this.impost = impost;
	}

	public Impost[] getImpostList() {
		return impostList;
	}

	public void setImpostList(Impost[] impostList) {
		this.impostList = impostList;
	}
	
	
 
}

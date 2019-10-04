package com.api.adminvas.dto;

import com.api.adminvas.domain.Impost;

public class ImpostDto extends Dto {
	
	private Impost impost;
	private Impost[] impostList;

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

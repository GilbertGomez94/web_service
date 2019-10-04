package com.api.adminvas.dto;

import com.api.adminvas.domain.MonetaryUnit;

public class MonetaryUnitDto extends Dto {
	
	private MonetaryUnit monetaryUnit;
	private MonetaryUnit[] monetaryUnitList;

	public MonetaryUnit getMonetaryUnit() {
		return monetaryUnit;
	}

	public void setMonetaryUnit(MonetaryUnit monetaryUnit) {
		this.monetaryUnit = monetaryUnit;
	}

	public MonetaryUnit[] getMonetaryUnitList() {
		return monetaryUnitList;
	}

	public void setMonetaryUnitList(MonetaryUnit[] monetaryUnitList) {
		this.monetaryUnitList = monetaryUnitList;
	}
	

}

package com.api.adminvas.dao;

import com.api.adminvas.domain.MonetaryUnit;

public class MonetaryUnitDao {
	
	private MonetaryUnit monetaryUnit;
	private MonetaryUnit[] monetaryUnitList;

	public MonetaryUnit getMonetaryUnit(MonetaryUnit monetaryUnit) throws Exception {
		return monetaryUnit;
	}

	public MonetaryUnit[] getMonetaryUnitList() throws Exception {
		return monetaryUnitList;
	}

	public void setMonetaryUnitList(MonetaryUnit[] monetaryUnitList) {
		this.monetaryUnitList = monetaryUnitList;
	}
	
	
	
	
}

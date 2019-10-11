package com.api.adminvas.dao;

import com.api.adminvas.domain.BasicTariff;

public class BasicTariffDao {
	
	private BasicTariff basicTariff;
	private BasicTariff[] basicTariffList;

	public BasicTariff getBasicTariff() throws Exception {
		return basicTariff;
	}

	public void setBasicTariff(BasicTariff basicTariff) {
		this.basicTariff = basicTariff;
	}

	public BasicTariff[] getBasicTariffList() {
		return basicTariffList;
	}

	public void setBasicTariffList(BasicTariff[] basicTariffList) {
		this.basicTariffList = basicTariffList;
	}
	
	
	

}

package com.api.adminvas.dto;

import com.api.adminvas.domain.BasicTariff;

public class BasicTariffDto extends Dto {
	
	private BasicTariff basicTariff;
	private BasicTariff[] basicTariffList;

	public BasicTariff getBasicTariff() {
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

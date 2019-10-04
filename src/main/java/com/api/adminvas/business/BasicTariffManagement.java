package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.BasicTariffDao;
import com.api.adminvas.domain.BasicTariff;
import com.api.adminvas.dto.BasicTariffDto;
public class BasicTariffManagement {
	
	private BasicTariff _basicTariff;
    private BasicTariffDao dao = new BasicTariffDao();
    private BasicTariffDto dto = new BasicTariffDto();

    public BasicTariffDto readBasicTariff(){
        _basicTariff = new BasicTariff();
        try{
            
            dto.setBasicTariff(dao.getBasicTariff());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

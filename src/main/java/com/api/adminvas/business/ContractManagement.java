package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.ContractDao;
import com.api.adminvas.domain.Contract;
import com.api.adminvas.dto.ContractDto;


public class ContractManagement {
	
	private Contract _contract;
    private ContractDao dao = new ContractDao();
    private ContractDto dto = new ContractDto();

    public ContractDto readContract(Contract contract){
        _contract = new Contract();
        try{
            
            dto.setContract(_contract);
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }

}

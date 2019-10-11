package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.ProviderDao;
import com.api.adminvas.domain.Provider;
import com.api.adminvas.dto.ProviderDto;


public class ProviderManagement {
	
	private Provider _provider;
    private ProviderDao dao = new ProviderDao();
    private ProviderDto dto = new ProviderDto();

    public ProviderDto readProvider(){
        _provider = new Provider();
        try{
            dto.setListprovider(dao.getListprovider());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public ProviderDto detailProvider(Provider provider){
        _provider = new Provider();
        try{
            dto.setListprovider(dao.getListprovider());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public ProviderDto insertProvider(Provider provider){
        try{
            dto.setListprovider(dao.getListprovider());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
    
    public ProviderDto updateProvider(Provider provider){
        try{
            dto.setListprovider(dao.getListprovider());
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
}

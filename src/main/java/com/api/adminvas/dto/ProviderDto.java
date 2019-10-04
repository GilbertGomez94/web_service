package com.api.adminvas.dto;

import com.api.adminvas.domain.Provider;

public class ProviderDto extends Dto {
	
	private Provider provider;
	private Provider[] Listprovider;

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
		
		
	}

	public Provider[] getListprovider() {
		return Listprovider;
	}

	public void setListprovider(Provider[] listprovider) {
		Listprovider = listprovider;
	}
	
	

}


package com.api.adminvas.dao;

import com.api.adminvas.domain.ProviderContact;

public class ProviderContactDao {

	private ProviderContact providerContact;
	private ProviderContact[] prividerContactList;

	public ProviderContact getProviderContact(ProviderContact providerContract) throws Exception {
		return providerContract;
	}

	public ProviderContact[] getPrividerContactList() {
		return prividerContactList;
	}

	public void setPrividerContactList(ProviderContact[] prividerContactList) {
		this.prividerContactList = prividerContactList;
	}
	
	
	
	
}

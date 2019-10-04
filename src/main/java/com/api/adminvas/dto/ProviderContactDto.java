package com.api.adminvas.dto;

import com.api.adminvas.domain.ProviderContact;

public class ProviderContactDto extends Dto {

	private ProviderContact providerContact;
	private ProviderContact [] providerContactList;

	public ProviderContact getProviderContact() {
		return providerContact;
	}

	public void setProviderContact(ProviderContact providerContact) {
		this.providerContact = providerContact;
	}

	public ProviderContact[] getProviderContactList() {
		return providerContactList;
	}

	public void setProviderContactList(ProviderContact[] providerContactList) {
		this.providerContactList = providerContactList;
	}
	
	
}

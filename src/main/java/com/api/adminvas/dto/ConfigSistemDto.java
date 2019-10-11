package com.api.adminvas.dto;

import com.api.adminvas.domain.ConfigSistem;

public class ConfigSistemDto extends Dto {

	private ConfigSistem configSistem;
	private ConfigSistem[] configSistemList;

	public ConfigSistem getConfigSistem() {
		return configSistem;
	}

	public void setConfigSistem(ConfigSistem configSistem) {
		this.configSistem = configSistem;
	}

	public ConfigSistem[] getConfigSistemList() {
		return configSistemList;
	}

	public void setConfigSistemList(ConfigSistem[] listConfigSistem) {
		this.configSistemList = listConfigSistem;
	}
	
	
	
	
}

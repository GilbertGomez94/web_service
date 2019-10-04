package com.api.adminvas.dto;

import com.api.adminvas.domain.ConfigSistem;

public class ConfigSistemDto extends Dto {

	private ConfigSistem configSistem;
	private ConfigSistem[] listConfigSistem;

	public ConfigSistem getConfigSistem() {
		return configSistem;
	}

	public void setConfigSistem(ConfigSistem configSistem) {
		this.configSistem = configSistem;
	}

	public ConfigSistem[] getListConfigSistem() {
		return listConfigSistem;
	}

	public void setListConfigSistem(ConfigSistem[] listConfigSistem) {
		this.listConfigSistem = listConfigSistem;
	}
	
	
	
	
}

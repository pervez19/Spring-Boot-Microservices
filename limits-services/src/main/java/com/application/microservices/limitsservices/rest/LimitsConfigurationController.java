package com.application.microservices.limitsservices.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.microservices.limitsservices.bean.LimitsConfiguration;
import com.application.microservices.limitsservices.config.Configuration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retriveLimitsFromConfigurations()
	{
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}
}

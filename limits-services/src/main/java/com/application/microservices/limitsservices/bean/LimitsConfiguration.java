package com.application.microservices.limitsservices.bean;

import lombok.Data;

@Data
public class LimitsConfiguration {
	
	private int maximum;
	private int minimum;
	
	public LimitsConfiguration()
	{
		
	}
	
	
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	
}

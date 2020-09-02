package com.application.microservices.bean;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CurrencyConversion {

	private int id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	public CurrencyConversion()
	{
		
	}
	
	public CurrencyConversion(int id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	
}

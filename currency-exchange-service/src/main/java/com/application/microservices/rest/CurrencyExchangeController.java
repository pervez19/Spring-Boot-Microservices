package com.application.microservices.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.microservices.bean.ExchangeValue;
import com.application.microservices.services.ExchangeValueServices;


@RestController
public class CurrencyExchangeController {
	
	private Environment environment;
	
	private ExchangeValueServices exchangeValueServices;
	
	@Autowired
	public CurrencyExchangeController(Environment environment, ExchangeValueServices exchangeValueServices) {
		this.environment = environment;
		this.exchangeValueServices = exchangeValueServices;
	}



	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
	
		 ExchangeValue exchangeValue=exchangeValueServices.findByFromAndTo(from, to);
		 exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		 return  exchangeValue;
		
	}

}

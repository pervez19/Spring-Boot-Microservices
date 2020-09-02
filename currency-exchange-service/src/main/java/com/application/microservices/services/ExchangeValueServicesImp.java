package com.application.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.microservices.bean.ExchangeValue;
import com.application.microservices.dao.ExchangeValueRepository;

@Service
public class ExchangeValueServicesImp implements ExchangeValueServices {

	private ExchangeValueRepository exchangeValueRepository;
	
	@Autowired
	public ExchangeValueServicesImp(ExchangeValueRepository exchangeValueRepository)
	{
		this.exchangeValueRepository=exchangeValueRepository;
	}
	
	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		return exchangeValueRepository.findByFromAndTo(from, to);
	}

}

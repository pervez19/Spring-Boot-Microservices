package com.application.microservices.services;

import com.application.microservices.bean.ExchangeValue;

public interface ExchangeValueServices {

	public ExchangeValue findByFromAndTo(String from, String to);
}

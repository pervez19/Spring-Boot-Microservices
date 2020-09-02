package com.application.microservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.microservices.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	public ExchangeValue findByFromAndTo(String from, String to); 

}

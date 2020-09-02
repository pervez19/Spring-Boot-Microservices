package com.application.microservices.bean;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name="exchangevalue")
@Data
public class ExchangeValue {

	
	@Id
	@Column(name="id")
	@SequenceGenerator(name="sequence",sequenceName="EXCHANGEVALUE_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence")
	private long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="CONVERSIONMULTIPLE", scale=2)
	private BigDecimal conversionMultiple;
	
	@Column(name="port")
	private int port;
	
	public ExchangeValue() {
	
	}

	public ExchangeValue(long id,String from, String to,BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", port=" + port + "]";
	}
		

	
}

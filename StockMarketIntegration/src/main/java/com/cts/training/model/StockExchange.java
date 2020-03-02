package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class StockExchange {
	
@Id
@GeneratedValue
	private int id;
	private String exchangeName;
	private String contractAddress;
	private String brief;
	private String remarks;

	public StockExchange() {
		
		
	}

	public StockExchange(int id, String exchangeName, String contractAddress, String brief, String remarks) {
		super();
		this.id = id;
		this.exchangeName = exchangeName;
		this.contractAddress = contractAddress;
		this.brief = brief;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", exchangeName=" + exchangeName + ", contractAddress=" + contractAddress
				+ ", brief=" + brief + ", remarks=" + remarks + "]";
	}
	
}

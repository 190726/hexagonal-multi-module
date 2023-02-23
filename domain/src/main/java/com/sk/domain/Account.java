package com.sk.domain;

import java.math.BigDecimal;

public class Account {
	
	private BigDecimal money;
	
	public Account(BigDecimal money) {
		this.money = money;
	}
	
	public BigDecimal money() {
		return this.money;
	}
}
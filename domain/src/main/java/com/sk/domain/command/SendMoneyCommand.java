package com.sk.domain.command;

import java.math.BigDecimal;

public class SendMoneyCommand {
	
	private BigDecimal money;
	
	public SendMoneyCommand(BigDecimal money) {
		this.money = money;
	}
	
	public BigDecimal money() {
		return this.money;
	}
}
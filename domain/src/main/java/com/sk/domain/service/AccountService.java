package com.sk.domain.service;

import java.util.List;

import com.sk.domain.Account;
import com.sk.domain.command.SendMoneyCommand;
import com.sk.domain.port.AccountLoadPort;
import com.sk.domain.port.AccountRegisterPort;

public class AccountService {
	
	private final AccountRegisterPort accountRegisterPort;
	private final AccountLoadPort accountLoadPort;
	
	public AccountService(AccountRegisterPort accountRegisterPort, AccountLoadPort accountLoadPort) {
		this.accountRegisterPort = accountRegisterPort;
		this.accountLoadPort = accountLoadPort;
	}

	public void sendMoney(SendMoneyCommand sendMoneyCommand) {
		Account account = new Account(sendMoneyCommand.money());
		System.out.println("AccountService:" + sendMoneyCommand.money());
		accountRegisterPort.sendMoney(account);
	}

	public List<Account> accounts() {
		return accountLoadPort.load();
	}
}
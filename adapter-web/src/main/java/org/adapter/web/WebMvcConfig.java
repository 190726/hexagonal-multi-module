package org.adapter.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sk.domain.port.AccountLoadPort;
import com.sk.domain.port.AccountRegisterPort;
import com.sk.domain.service.AccountService;

@Configuration
public class WebMvcConfig {
	
	@Bean
	public AccountService accountService(AccountRegisterPort accountRegisterPort, AccountLoadPort accountLoadPort) {
		System.out.println("account service bean created");
		return new AccountService(accountRegisterPort, accountLoadPort);
	}
}
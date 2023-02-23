package org.adapter.web;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.domain.command.SendMoneyCommand;
import com.sk.domain.service.AccountService;


@RestController
@RequestMapping("/send")
public class SendMoneyController {
	
	private final AccountService accountService;
	
	public SendMoneyController(AccountService accountService) {
		this.accountService = accountService;
	}

	
	
	@GetMapping
	public String send(@RequestParam String money) {
		
		SendMoneyCommand command = new SendMoneyCommand(new BigDecimal(money));
		
		accountService.sendMoney(command);
		
		return "success";
	}
	
	@GetMapping("/accounts")
	public List<AccountsResponse> accounts(){
		return accountService.accounts().stream()
				.map(account -> new AccountsResponse(1L, account.money().toPlainString()))
				.collect(Collectors.toList());
	}
	
	
}
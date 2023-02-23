package com.sk.domain.port;

import java.util.List;

import com.sk.domain.Account;

public interface AccountLoadPort {
	
	List<Account> load();
}
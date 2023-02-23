package org.adapter.db.out;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sk.domain.Account;
import com.sk.domain.port.AccountLoadPort;
import com.sk.domain.port.AccountRegisterPort;

@Repository
public class AccountPersistenceAdapter implements AccountRegisterPort, AccountLoadPort{
	
	private AccountRepository accountRepository;
	
	public AccountPersistenceAdapter(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void sendMoney(Account account) {
		AccountEntity entity = new AccountEntity();
		entity.money(account.money().toPlainString());
		accountRepository.save(entity);
	}

	@Override
	public List<Account> load() {
		List<AccountEntity> entities = accountRepository.findAll();
		return entities.stream().map(AccountEntity::toDomain)
						 .collect(toList());
	}
}
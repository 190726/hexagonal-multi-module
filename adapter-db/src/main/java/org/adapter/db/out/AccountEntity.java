package org.adapter.db.out;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sk.domain.Account;



@Table(name = "ACCOUNT")
@Entity
public class AccountEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String money;
	
	public AccountEntity() {};
	
	public AccountEntity(Long id, String money) {
		this.id = id;
		this.money = money;
	}
	
	public void money(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", money=" + money + "]";
	}
	
	public Account toDomain() {
		return new Account(new BigDecimal(this.money));
	}
}

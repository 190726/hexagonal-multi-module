package org.adapter.web;

public class AccountsResponse {
	
	private Long id;
	
	private String money;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public AccountsResponse(Long id, String money) {
		this.id = id;
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountsResponse [id=" + id + ", money=" + money + "]";
	}
}

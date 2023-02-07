package com.nestjavatraining.entity;

/**
 * @author irshad
 *
 */
public class Account {
	static int basicAccNo = 101;
	private String accountNo;
	private String accountName;
	private float balance=0;
	private String username;
	private String password;
	

	public Account() {
		super();
	}

	public Account(String accountName,String username,String password) {
		super();
		this.accountNo ="ACC"+String.valueOf(this.basicAccNo);
		this.accountName = accountName;
		this.basicAccNo +=1;
		this.username = username;
		this.password = password;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

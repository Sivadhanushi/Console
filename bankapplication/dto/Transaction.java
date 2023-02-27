package com.zsgs.bankapplication.dto;
import java.util.Date;
public class Transaction {
	private int accountNumber;
	private Long  balance;
	private String transactionType;
	private Date Date;
	private long accountbalance;
	
	
	public Transaction(int accountNumber, Long balance, Date date,String transactionType,long accountbalance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.Date = date;
		this.transactionType=transactionType;
		this.accountbalance=accountbalance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public Long getBalance() {
		return balance;
	}


	public String getTransectionType() {
		return transactionType;
	}


	public Date getDate() {
		return Date;
	}


	public long getAccountbalance() {
		return accountbalance;
	}
}


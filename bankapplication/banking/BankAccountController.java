package com.zsgs.bankapplication.banking;


import java.util.ArrayList;
import java.util.Date;

import com.zsgs.bankapplication.dto.Transaction;

public class BankAccountController {
	private BankAccount bankaccount;
	public BankingAccountView bankaccountview;
	public BankAccountController(BankingAccountView bankaccountview) 
	{
		
		this.bankaccountview=bankaccountview;
	    this.bankaccount=new BankAccount(this);
	}
	
	public void checkBalance(int accountno) {
		bankaccount.CheckBalance(accountno);	
	}
	public void returncheckBalance(long balance) {
		bankaccountview.viewAcBalance(balance);
	}
	public void returncheckBalance(String error) {
		bankaccountview.viewAcBalance(error);
	}

	public void checkWithDrawFund(int  accountNo,long Amount, Date dateInput) {
		bankaccount.checkWithDrawFund(accountNo,Amount,dateInput);
	}
	public void returncheckWithDrawFund(long balance,long amount) {
		bankaccountview.withdrawBalance(balance, amount);
	}
    public void returncheckWithDrawFund(String  error) {
    	bankaccountview.withdrawBalance(error);
	}


	public void checkTrasactionHistory(int accountNo) {
		bankaccount.CheckTransactionHistory(accountNo);
	}
	public void returnTrasactionHistory(ArrayList<Transaction> userTansaction) {
		bankaccountview.transectionHistory(userTansaction);		
	}

	public void checkDeposit(int accountNo,long Amount, Date date ) {
		bankaccount.checkDeposit(accountNo,Amount,date);
		
	}
	public  void returncheckDeposit(long balance, long amount) {

		bankaccountview.depositBalance(balance, amount);
	}
}
package com.financeprogram.account;

import java.util.ArrayList;

import com.financeprogram.bank.Bank;
import com.financeprogram.data.LoadUnloadData;
import java.io.Serializable;

public class BankAccount implements BankOperation, Serializable{
	private String name;//название счета
	private double balance;//состояние баланса
	private final static String CURRENCY = "EUR";//наименование валюты
	private ArrayList<Account> accounts;
	private boolean shutdown;//переменная для выхода из цикла
	
	//конструктор
	public BankAccount(String name, double balance){
		this.balance = balance;
                this.name = name;
	}

	//зачисление на счет
	@Override
	public void add(double amount) {
		this.balance = this.balance+amount;
		
	}
	//списание со счета
	@Override
	public void subtract(double amount) {
		this.balance = this.balance-amount;
	}
	//перевод между счетами
	@Override
	public int transfer(String bankAccount, double amount) {
            int i;
		shutdown = false;
		Bank bank = new Bank();
		ArrayList<BankAccount> bankAccounts= new ArrayList();
		this.balance = this.balance-amount;
		this.accounts = bank.getAllAccounts();
		for(Account otherAccount:accounts){
                    i=0;
			bankAccounts = otherAccount.getBankAccounts();
			for (BankAccount bA:bankAccounts){
				if (bA.getName().equals(bankAccount)){
					bA.add(amount);
					shutdown = true;
                                        return i;
				}
                            i++;
			}
			if (shutdown) break;
                        
		}
	return -1;	
	}
	//получить валюту
	public String getCurrency() {
		return CURRENCY;
	}
	//получить баланс
	public double getBalance() {
		return balance;
	}
	//получить имя
	public String getName() {
		return name;
	}



}

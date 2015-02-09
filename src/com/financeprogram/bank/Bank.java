package com.financeprogram.bank;
import java.util.ArrayList;

import com.financeprogram.account.Account;
import com.financeprogram.data.LoadUnloadData;

public class Bank {
	private static ArrayList <Account> accounts;//список аккаунтов
	private LoadUnloadData dataAccounts;//загруженные данные из файла об аккаунтах
        private Account userAccount;
	//конструктор
	public Bank(){
		dataAccounts = new LoadUnloadData();
	}
        //загрузить информацию об авторизированном аккаунтe
	public void setUserAccount(Account ac) {
		this.userAccount = ac;
	}
         //получить информацию об авторизированном аккаунтe
	public Account getUserAccount() {
		return userAccount;
	}
	//загрузить информацию об аккаунтах
	public void setAccounts() {
		this.accounts = dataAccounts.load();
	}
        //сохранить информацию об аккаунтах
	public void saveAccounts() {
		dataAccounts.unload(accounts);
	}
	//получить информацию об аккаунте по индексу
	public Account getAccount(int accountIndex) {
		return this.accounts.get(accountIndex);
	}
	//добавить аккаунт
	public void addAccount(Account account) {
		this.accounts.add(account);
		
	}
	//удалить аккаунт
	public void deleteAccount(int accountIndex) {
		this.accounts.remove(accountIndex);
	}
	//получить информацию обо всех аккаунтах
	public ArrayList <Account> getAllAccounts() {
		return this.accounts;
	}	


}

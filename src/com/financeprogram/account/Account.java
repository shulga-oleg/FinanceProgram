package com.financeprogram.account;

import java.io.Serializable;
import java.util.ArrayList;

import com.financeprogram.user.User;

public class Account  implements Serializable{

	private static final long serialVersionUID = 1L;
	private User user;//клиент(информация о пользователе)
	private ArrayList <BankAccount> bankAccounts = new ArrayList <BankAccount>();//список банковских счетов
	
	
	//конструктор
	public Account(String firstName, String secondName, String login, String password){
		this.user = new User(firstName, secondName, login, password);
	}

	//получить информацию о пользователе
	public User getUser() {
		return user;
	}
        //добавить счет 
        public void AddBankAccount(BankAccount bA){
            this.bankAccounts.add(bA);
        }
        
        //удалить счет
        public void deleteBankAccount(int indexBankAccount){
             this.bankAccounts.remove(indexBankAccount);
        }
                
	//получить список счетов
	public ArrayList <BankAccount> getBankAccounts(){
		return bankAccounts;
	}

}

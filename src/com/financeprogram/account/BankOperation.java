package com.financeprogram.account;

public interface BankOperation {
	//зачислить на счет
	void add(double amount);
	//списать со счета
	void subtract(double amount);
	//перевод с одного счета на другой
	int transfer(String bankAccount, double amount);
}

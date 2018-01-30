package com.capgemini.Service;

import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;

public interface AccountService {

	Account createAccount(int accountNumber, int amount) throws InsufficientInitialAmountException;
	int depositAccount(int accountNumber, int amount) throws InvalidAccountNumberException;
	int withdrawAmmount(int accountNumber, int amount) throws InvalidAccountNumberException,InsufficientInitialAmountException;
}
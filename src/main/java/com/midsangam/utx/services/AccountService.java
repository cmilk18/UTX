package com.midsangam.utx.services;

import com.midsangam.utx.model.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);

    public List<Account> readAllAccounts();

    public boolean login(Account account);

    public Account readAccountById(Integer id);

    public Account updateAccount(Integer id, Account account);

    public boolean deleteAccount(Integer id);
}

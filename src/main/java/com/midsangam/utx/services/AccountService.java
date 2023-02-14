package com.midsangam.utx.services;

import com.midsangam.utx.model.Account;

import java.util.List;

public interface AccountService {
    public Account saveAccount(Account account);

    public List<Account> getAllAccounts();

    public boolean login(Account account);
}

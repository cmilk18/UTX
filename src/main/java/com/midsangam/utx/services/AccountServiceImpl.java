package com.midsangam.utx.services;

import com.midsangam.utx.repository.AccountRepository;
import com.midsangam.utx.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public boolean login(Account account) {
        Account findAccount = accountRepository.findByEmail(account.getEmail());
        System.out.println(findAccount.toString());
        if(findAccount == null){
            return false;
        }
        if(!findAccount.getPassword().equals(account.getPassword())){
            return false;
        }
        return true;
    }


}

package com.midsangam.utx.services.logic;

import com.midsangam.utx.repository.AccountRepository;
import com.midsangam.utx.model.Account;
import com.midsangam.utx.services.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> readAllAccounts() {
        return accountRepository.findAll();
    }

    //https://bestkingit.tistory.com/144
    @Override
    public boolean login(Account account) {
        Account findAccount = accountRepository.findByEmail(account.getEmail());
        System.out.println("여기");
        //System.out.println(findAccount.toString());
        if(findAccount == null){
            System.out.println("아이디 오류");
            return false;
        }
        if(!findAccount.getPassword().equals(account.getPassword())){
            System.out.println("비번 오류");
            return false;
        }
        return true;
    }

    @Override
    public Account readAccountById(Integer id) {
        Account account1 = accountRepository.findById(id).get();
        Account account = new Account();
        BeanUtils.copyProperties(account1,account);
        return account;
    }

    @Override
    public Account updateAccount(Integer id, Account account) {
        Account account1 = accountRepository.findById(id).get();

        account1.setEmail(account.getEmail());
        account1.setPassword(account.getPassword());
        account1.setName(account.getName());
        account1.setNumber(account.getNumber());

        accountRepository.save(account1);
        return null;
    }

    @Override
    public boolean deleteAccount(Integer id) {
        Account account1 = accountRepository.findById(id).get();
        accountRepository.delete(account1);
        return true;
    }


}

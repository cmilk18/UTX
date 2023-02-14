package com.midsangam.utx.controller;

import com.midsangam.utx.repository.AccountRepository;

import com.midsangam.utx.model.Account;
import com.midsangam.utx.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private AccountRepository account;

    public AccountController(AccountRepository account){
        this.account = account;
    }

    @PostMapping("/add")
    public String add(@RequestBody Account account){
        accountService.saveAccount(account);
        return "new account add";
    }

    @GetMapping("/getAll")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }


//    @PostMapping("/logIn")
//    public String findByEmailAndPassword(@RequestParam("email") String email, @RequestParam("password") String password){
//
//        return "ok";
//    }

    @PostMapping("/login")
    public String loginId(@RequestBody Account account){
        if(accountService.login(account)){
            return "login";
        }
        return "fail";
    }
}

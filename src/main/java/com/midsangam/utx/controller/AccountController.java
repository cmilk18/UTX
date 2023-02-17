package com.midsangam.utx.controller;

import com.midsangam.utx.repository.AccountRepository;

import com.midsangam.utx.model.Account;
import com.midsangam.utx.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //private AccountRepository account;

//    public AccountController(AccountRepository account){
//        this.account = account;
//    }

    @PostMapping("/create")
    public String createAccount(@RequestBody Account account){
        accountService.createAccount(account);
        return "new account add";
    }

    @GetMapping("/readAll")
    public List<Account> readAllAccounts(){
        return accountService.readAllAccounts();
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

    @GetMapping("/read/{id}")
    public ResponseEntity<Account> readAccountById(@PathVariable("id")Integer id){
        Account account = null;
        account = accountService.readAccountById(id);

        return ResponseEntity.ok(account);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable("id")Integer id,@RequestBody Account account){
        account = accountService.updateAccount(id,account);
        return ResponseEntity.ok(account);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>>deleteAccount(@PathVariable("id")Integer id){
        boolean deleted = false;
        deleted = accountService.deleteAccount(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }
}

package com.generics.genericbankingapi.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @GetMapping("api/accounts/all")
    public String getAllAccounts(){
        return "Accounts";
    }
    @GetMapping("api/accounts/{accountId}")
    public String getAccountById(@PathVariable Long accountId){
        return String.format("%s", accountId);
    }
    @PostMapping("api/accounts")
    public void createAccount(){}
    @DeleteMapping("api/accounts/{accountId}")
    public String deactivateAccount(@PathVariable Long accountId){
        return String.format("%s", accountId);
    }
}

package com.generics.genericbankingapi.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts/")
public class AccountController {
    @GetMapping("all")
    public String getAllAccounts(){
        return "Accounts";
    }
    @GetMapping("{accountId}")
    public String getAccountById(@PathVariable Long accountId){
        return String.format("%s", accountId);
    }
    @PostMapping("")
    public void createAccount(){}
    @DeleteMapping("{accountId}")
    public String deactivateAccount(@PathVariable Long accountId){
        return String.format("%s", accountId);
    }
}

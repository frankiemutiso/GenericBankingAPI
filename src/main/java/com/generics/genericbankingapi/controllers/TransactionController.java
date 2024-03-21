package com.generics.genericbankingapi.controllers;

import com.generics.genericbankingapi.dtos.CreateTransactionDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transactions/")
public class TransactionController {
    @GetMapping("all")
    public String getAllTransactions(){
        return "Transactions";
    }
    @GetMapping("{id}")
    public String getTransactionById(@PathVariable Long id){
        return String.format("%s",id);
    }
    @PostMapping("")
    public String createTransaction(@RequestBody CreateTransactionDTO createTransactionDTO){
        return String.format("Body: %s", createTransactionDTO.transactionType());
    }
}

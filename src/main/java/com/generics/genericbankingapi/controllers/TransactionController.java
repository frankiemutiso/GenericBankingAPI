package com.generics.genericbankingapi.controllers;

import com.generics.genericbankingapi.dtos.CreateTransactionDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
    @GetMapping("api/transactions/all")
    public String getAllTransactions(){
        return "Transactions";
    }
    @GetMapping("api/transactions/{id}")
    public String getTransactionById(@PathVariable Long id){
        return String.format("%s",id);
    }
    @PostMapping("api/transactions")
    public String createTransaction(@RequestBody CreateTransactionDTO createTransactionDTO){
        return String.format("Body: %s", createTransactionDTO.transactionType());
    }
}

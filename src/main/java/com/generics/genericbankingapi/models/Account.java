package com.generics.genericbankingapi.models;

import com.generics.genericbankingapi.enums.AccountType;

import java.math.BigDecimal;

public class Account {
    private long id;
    private BigDecimal balance;

    private AccountType accountType;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}

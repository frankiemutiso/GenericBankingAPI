package com.generics.genericbankingapi.models;

import com.generics.genericbankingapi.enums.TransactionType;

import java.math.BigDecimal;

public class Transaction {
    private long id;
    private TransactionType transactionType;
    private BigDecimal amount;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}

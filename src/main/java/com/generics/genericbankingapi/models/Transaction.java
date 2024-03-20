package com.generics.genericbankingapi.models;

import com.generics.genericbankingapi.enums.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

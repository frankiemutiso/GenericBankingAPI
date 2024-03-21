package com.generics.genericbankingapi.models;

import com.generics.genericbankingapi.enums.TransactionType;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "transaction_type")
    private TransactionType transactionType;
    @Column(name = "amount")
    private BigDecimal amount;

    public void setId(int id) {
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

package com.generics.genericbankingapi.dtos;

import com.generics.genericbankingapi.enums.TransactionType;

import java.math.BigDecimal;

public record CreateTransactionDTO(TransactionType transactionType, BigDecimal amount) {
}

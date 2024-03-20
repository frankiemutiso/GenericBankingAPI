package com.generics.genericbankingapi.dtos;

import com.generics.genericbankingapi.enums.TransactionType;

import java.math.BigDecimal;

public record TransactionCreationDTO(TransactionType transactionType,BigDecimal amount) {
}

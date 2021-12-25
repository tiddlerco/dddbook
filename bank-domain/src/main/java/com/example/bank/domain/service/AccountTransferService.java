package com.example.bank.domain.service;

import com.example.bank.domain.entity.Account;
import com.example.bank.exception.DailyLimitExceededException;
import com.example.bank.types.ExchangeRate;
import com.example.bank.types.Money;

/**
 * 两个账号之间相互转账
 */
public interface AccountTransferService {
    void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate) throws Exception, DailyLimitExceededException;
}

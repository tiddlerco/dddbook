package com.example.bank.domain.types;

import com.example.bank.domain.entity.Account;
import com.example.bank.types.AccountNumber;
import com.example.bank.types.Money;
import com.example.bank.types.UserId;
import lombok.Data;

import java.util.Date;

@Data
public class AuditMessage {
    private UserId userId;
    private AccountNumber source;
    private AccountNumber target;
    private Money money;
    private Date date;

    public String serialize() {
        return userId + "," + source + "," + target + "," + money + "," + date;
    }

    public AuditMessage(Account sourceAccount, Account targetAccount, Money targetMoney) {

    }
}

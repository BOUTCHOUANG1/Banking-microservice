package com.nathan.account.mapper;

import com.nathan.account.dto.AccountsDto;
import com.nathan.account.model.Accounts;

public class AccountMapper {

    public static AccountsDto mapToAccountDto(AccountsDto accountsDto, Accounts accounts) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccount(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}

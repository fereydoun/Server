package dotin.entities;

import dotin.interfaces.IAccount;

import java.math.BigDecimal;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public class Account implements IAccount{

    private String accountNumber;
    private String customerNumber;
    private BigDecimal balance;
    private BigDecimal initialBalance;
    private BigDecimal upperBound;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }

    public BigDecimal getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(BigDecimal upperBound) {
        this.upperBound = upperBound;
    }


    public void deposit(BigDecimal amount)
    {

    }

    public void withdraw(BigDecimal amount)
    {

    }
}

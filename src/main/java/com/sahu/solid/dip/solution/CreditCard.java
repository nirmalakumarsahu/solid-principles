package com.sahu.solid.dip.solution;

import java.math.BigDecimal;

public class CreditCard implements BankCard {
    @Override
    public void doTransaction(BigDecimal amount) {
        System.out.println("Transaction done with CreditCard");
    }
}

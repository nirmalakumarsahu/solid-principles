package com.sahu.solid.dip.solution;


import java.math.BigDecimal;

public class ShoppingMall {
    private final BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, BigDecimal amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard card = new CreditCard(); // can easily switch to DebitCard
        ShoppingMall mall = new ShoppingMall(card);
        mall.doPayment("some order", BigDecimal.valueOf(5000));
    }
}

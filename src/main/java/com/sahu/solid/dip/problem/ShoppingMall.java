package com.sahu.solid.dip.problem;

import java.math.BigDecimal;

public class ShoppingMall {
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(Object order, BigDecimal amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall mall = new ShoppingMall(debitCard);
        mall.doPayment("some order", BigDecimal.valueOf(5000));
    }
}

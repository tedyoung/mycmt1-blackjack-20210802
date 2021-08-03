package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireAmountGreaterThanZero(amount);
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    private void requireAmountGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }
}

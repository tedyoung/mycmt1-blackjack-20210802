package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public Wallet(int initialDeposit) {
        balance = initialDeposit;
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireZeroOrMore(amount);
        requireNonZero(amount);
        balance += amount;
    }

    private void requireNonZero(int amount) {
        if (amount == 0) {
            throw new IllegalArgumentException();
        }
    }

    public int balance() {
        return balance;
    }

    public void bet(int amount) {
        requireZeroOrMore(amount);
        balance -= amount;
    }

    private void requireZeroOrMore(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }

}

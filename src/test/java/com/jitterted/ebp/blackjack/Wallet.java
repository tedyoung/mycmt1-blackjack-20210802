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

    public int balance() {
        return balance;
    }

    public void bet(int betAmount) {
        requireZeroOrMore(betAmount);
        requireSufficientBalanceFor(betAmount);
        balance -= betAmount;
    }

    private void requireSufficientBalanceFor(int amount) {
        if (amount > balance) {
            throw new IllegalStateException();
        }
    }

    private void requireNonZero(int amount) {
        if (amount == 0) {
            throw new IllegalArgumentException();
        }
    }

    private void requireZeroOrMore(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }

}

package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletBettingTest {

    @Test
    public void walletWithBalanceOf12WhenBet8ThenBalanceIs4() throws Exception {
        // Given
        Wallet wallet = new Wallet(12);

        // When
        wallet.bet(8);

        // Then
        assertThat(wallet.balance())
                .isEqualTo(12 - 8); // <-- "EVIDENT DATA"
    }

    @Test
    public void walletWith27Bet7And9ThenBalanceIs11() throws Exception {
        Wallet wallet = new Wallet(27);

        wallet.bet(7);
        wallet.bet(9);

        assertThat(wallet.balance())
                .isEqualTo(27 - 7 - 9);
    }

    @Test
    public void betFullBalanceThenWalletIsEmpty() throws Exception {
        Wallet wallet = new Wallet(73);

        wallet.bet(73);

        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void betZeroIsFine() throws Exception {
        Wallet wallet = new Wallet(1);

        wallet.bet(0);

        assertThat(wallet.balance())
                .isEqualTo(1);
    }

    @Test
    public void betLessThanZeroThrowsException() throws Exception {
        Wallet wallet = new Wallet(1);

        assertThatThrownBy(() -> {
            wallet.bet(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void betMoreThanBalanceThrowsException() throws Exception {
        Wallet wallet = new Wallet(10);

        assertThatThrownBy(() -> {
            wallet.bet(11);
        }).isInstanceOf(IllegalStateException.class);
    }

}

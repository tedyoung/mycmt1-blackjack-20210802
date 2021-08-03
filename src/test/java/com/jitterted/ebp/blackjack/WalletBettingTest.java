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


}

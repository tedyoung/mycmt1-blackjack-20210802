package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SuitColorTest {

    @Test
    public void heartsIsRedIsTrue() throws Exception {
        assertThat(Suit.HEARTS.isRed())
                .isTrue();
    }

    @Test
    public void clubsIsRedIsFalse() throws Exception {
        assertThat(Suit.CLUBS.isRed())
                .isFalse();
    }
}
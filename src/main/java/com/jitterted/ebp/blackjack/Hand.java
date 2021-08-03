package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<>();

    // GOAL: remove this getter
    public List<Card> getCards() {
        return cards;
    }
}

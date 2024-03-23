package main.model;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private final Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<>();
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // or handle empty deck scenario
        }
        return cards.pop();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}

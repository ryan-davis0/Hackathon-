package main.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // or handle empty deck scenario
        }
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}

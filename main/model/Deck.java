package main.model;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private final Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<>();
        //initialize the cards in the deck here
        cards.push(new Card("Cheese", "main/resources/cheese.jpg", 2, 1));
        cards.push(new Card("Pangolin", "main/resources/devious ass pangolin.jpg", 2, 1));
        cards.push(new Card("Sad", "main/resources/He looks so sad.jpg", 2, 1));
        cards.push(new Card("Snatcher", "main/resources/I know this guy would snatch my shit look at his face.jpg", 2, 1));
        cards.push(new Card("Megamind", "main/resources/megamind looking.jpg", 2, 1));
        cards.push(new Card("Gecko", "main/resources/pure evil gecko.jpg", 2, 1));
        cards.push(new Card("Rawr", "main/resources/Rawrrrr.jpg", 2, 1));
        cards.push(new Card("Turtle", "main/resources/stupid ass turtle.jpg", 2, 1));
        cards.push(new Card("King", "main/resources/THE KING!.jpg", 2, 1));
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

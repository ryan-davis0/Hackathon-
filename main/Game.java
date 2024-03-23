package main;
import main.model.Card;
import main.model.Deck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        // Example of adding cards
        deck.addCard(new Card("Bear", 3));
        deck.addCard(new Card("Wolf", 2));
        deck.addCard(new Card("Rabbit", 1));
        
        deck.shuffle();

        System.out.println("Drawing cards from deck:");
        Card drawnCard;
        while ((drawnCard = deck.drawCard()) != null) {
            System.out.println("You drew: " + drawnCard);
            // Here, you would add more gameplay logic, such as playing the card, applying effects, etc.
        }

        System.out.println("The deck is empty!");
    }
}

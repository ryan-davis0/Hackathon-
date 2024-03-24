package main.Game;

import main.GUI.NewJFrame;
import main.model.Card;
import main.model.Deck;

public class Player {
    private final Deck deck;
    private final Card[] hand;
    private final Card[] playArea;
    private byte health;
    private byte selectedHandIndex;//0xff means none selected
    private byte selectedPlayAreaIndex;//0xff means none selected

    public Player() {
        deck = new Deck();
        hand = new Card[6];
        playArea = new Card[4];
        health = 10;
        selectedHandIndex = (byte) 0xff;
        selectedPlayAreaIndex = (byte) 0xff;
    }

    public void Draw3() {
        //draw 3
        //but if there aren't 3 available spaces, draw to fill the hand
        //if the hand is full, don't draw
        //draw means pop from deck and put card in hand
        for (byte i = 0, drawn = 0; i < hand.length && drawn < 3; i++) {
            if (hand[i] == null) {
                hand[i] = deck.drawCard();
                NewJFrame.buttonMap.get(NewJFrame.CardSpace.myHand, i).cardListener.ChangeCard(hand[i]);
                drawn++;
            }
        }
    }

    public void SelectCardInHand(byte index) {
        //index is gotten from the button action listener
        selectedHandIndex = selectedHandIndex == index? (byte) 0xff : index;
    }

    public void SelectSlotInPlayArea(byte index) {
        //index is gotten from the button action listener
        selectedPlayAreaIndex = selectedPlayAreaIndex == index? (byte) 0xff : index;
    }

    /**Returns whether the card was successfully moved from the hand to the play area.*/
    public boolean TryMoveToPlayArea() {
        //move the card from the hand to the play area based on which ones wee selected
        boolean success = false;
        if (selectedHandIndex != (byte) 0xff && selectedPlayAreaIndex != (byte) 0xff && playArea[selectedPlayAreaIndex] == null && hand[selectedHandIndex] != null) {
            playArea[selectedPlayAreaIndex] = hand[selectedHandIndex];
            hand[selectedHandIndex] = null;
            NewJFrame.buttonMap.get(NewJFrame.CardSpace.myPlayArea, selectedPlayAreaIndex).cardListener.ChangeCard(playArea[selectedPlayAreaIndex]);
            NewJFrame.buttonMap.get(NewJFrame.CardSpace.myHand, selectedHandIndex).cardListener.ChangeCard(hand[selectedHandIndex]);
            success = true;
        }
        selectedHandIndex = (byte) 0xff;
        selectedPlayAreaIndex = (byte) 0xff;
        return success;
    }
}
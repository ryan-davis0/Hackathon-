package main.Game;

import main.GUI.NewJFrame;
import main.model.Tuple;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**Non instantiable class to hold game state. Also, a library for game actions.*/
public class Game {
    //declare game state as static variables
    //state will include players, decks, cards, etc
    public static Player human;
    public static Bot bot;

    /**DO NOT INSTANTIATE*/
    private Game() throws InstantiationException {throw new InstantiationException("Game should not be instantiated.");}

    public static void CreateGame() {
        Reset();
    }

    public static void Reset() {
        //initialize game state
        //populate the cards in the deck
        //set any starting state
        human = new Player();
        bot = new Bot();
    }

    public static void ProcessTurn() {}
}
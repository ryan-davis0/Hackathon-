package main.model;
public class Card {
    private String name;
    private int attackPoints;

    public Card(String name, int attackPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    @Override
    public String toString() {
        return name + " (Attack: " + attackPoints + ")";
    }
}

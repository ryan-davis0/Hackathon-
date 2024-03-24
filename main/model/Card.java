package main.model;

public class Card {
    private final String name;
    public final String imgPath;
    private int attackPoints;
    private int health;

    public Card(String name, String path, int attackPoints,int health) {
        this.name = name;
        this.imgPath = path;
        this.attackPoints = attackPoints;
        this.health = health;
    }

    public String getName() {return name;}
    public int getAttackPoints() {return attackPoints;}
    public int getHealthPoints(){return health;}

    public void changeHealth(int change){health-=change;}
    public void changeAttackPoints(int change){attackPoints+=change;}
    @Override
    public String toString() {
        return name + " (Attack: " + attackPoints + ")";
    }
}
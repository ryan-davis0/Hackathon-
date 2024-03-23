package main.model;

public record Card(String name, int attackPoints) {

    @Override
    public String toString() {
        return name + " (Attack: " + attackPoints + ")";
    }
}
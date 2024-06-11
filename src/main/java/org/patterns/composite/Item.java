package org.patterns.composite;

public class Item implements IComponent{

    private String name;
    private int cost;
    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
}

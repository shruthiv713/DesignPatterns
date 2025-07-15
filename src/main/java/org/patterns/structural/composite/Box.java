package org.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements IComponent{

    private List<IComponent> components;
    private String name;

    public Box(String name) {
        components = new ArrayList<>();
        this.name = name;
    }
    public void addComponent(IComponent component) {
        components.add(component);
    }
    public void removeComponent(IComponent component) {
        components.remove(component);
    }
    @Override
    public int getCost() {
        return components.stream().map(c->c.getCost()).reduce(0,Integer::sum);
    }

    @Override
    public String getName() {
        return name + "," + components.stream().map(c->c.getName()).reduce("", (a,b)-> a+","+b);
    }
}

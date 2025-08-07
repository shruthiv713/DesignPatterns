package org.patterns.behavioral.templatemethod;

public class PancakeRecipe extends BreakfastRecipe {

    @Override
    public void prepareIngredients() {
        System.out.println("Mixing flour, milk, eggs, and sugar to make the batter.");
    }

    @Override
    public void cookDish() {
        System.out.println("Pouring batter onto a hot griddle and flipping when bubbly.");
    }

    @Override
    public void serve() {
        System.out.println("Serving pancakes with maple syrup and a side of fruit.");
    }
}
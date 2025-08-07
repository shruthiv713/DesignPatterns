package org.patterns.behavioral.templatemethod;

public abstract  class BreakfastRecipe {

    public void prepareBreakfast() {
        System.out.println("--- Starting Breakfast Preparation ---");
        gatherIngredients();
        prepareIngredients();
        cookDish();
        serve();
        System.out.println("--- Breakfast is Served! ---");

    }
    // Concrete method with a fixed implementation
    private void gatherIngredients() {
        System.out.println("Gathering all necessary ingredients from the pantry and fridge.");
    }

    // Abstract methods that subclasses must implement
    public abstract void prepareIngredients();
    public abstract void cookDish();

    // Hook method: An optional step that can be overridden
    public void serve() {
        // Default behavior: just serve the dish
        System.out.println("Serving the breakfast on a clean plate.");
    }



}

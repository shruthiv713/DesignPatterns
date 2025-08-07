package org.patterns.behavioral.templatemethod;

public class ScrambledEggsRecipe extends BreakfastRecipe {

    @Override
    public void prepareIngredients() {
        System.out.println("Whisking eggs in a bowl with a pinch of salt and pepper.");
    }

    @Override
    public void cookDish() {
        System.out.println("Cooking the eggs in a pan over medium heat, stirring gently.");
    }
    // We don't need to override the serve() method, the default is sufficient.
}
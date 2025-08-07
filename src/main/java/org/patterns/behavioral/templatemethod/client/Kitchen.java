package org.patterns.behavioral.templatemethod.client;

import org.patterns.behavioral.templatemethod.BreakfastRecipe;
import org.patterns.behavioral.templatemethod.PancakeRecipe;
import org.patterns.behavioral.templatemethod.ScrambledEggsRecipe;

public class Kitchen {

    public static void main(String[] args) {
        BreakfastRecipe pancakes = new PancakeRecipe();

        BreakfastRecipe scrambledEggs = new ScrambledEggsRecipe();

        pancakes.prepareBreakfast();

        scrambledEggs.prepareBreakfast();
    }
}

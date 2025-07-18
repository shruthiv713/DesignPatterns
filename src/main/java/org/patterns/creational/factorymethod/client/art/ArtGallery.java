package org.patterns.creational.factorymethod.client.art;

import org.patterns.creational.factorymethod.factory.art.ArtStudio;
import org.patterns.creational.factorymethod.factory.art.PaintingStudio;
import org.patterns.creational.factorymethod.factory.art.SculptureStudio;

public class ArtGallery {

    public static void main(String[] args) {
        System.out.println("--- Welcome to the Art Gallery ---");

        // Client wants a painting
        ArtStudio paintingStudio = new PaintingStudio();
        System.out.println("Client: Ordering a painting...");
        paintingStudio.produceAndShowArt("Starry Night", "Vincent van Gogh", "Oil on Canvas");

        // Client wants a sculpture
        ArtStudio sculptureStudio = new SculptureStudio();
        System.out.println("Client: Ordering a sculpture...");
        sculptureStudio.produceAndShowArt("David", "Michelangelo", "Marble");

        // We can easily add a new type of art (e.g., Photography)
        // without modifying existing code, just by adding new ConcreteProduct and ConcreteCreator classes.
        // For example, if we had a PhotographyStudio:
        // ArtStudio photographyStudio = new PhotographyStudio();
        // photographyStudio.produceAndShowArt("Sunrise over Himalayas", "Ansel Adams", "Black and White");

        System.out.println("--- Art Gallery Visit Concluded ---");
    }
}

package org.patterns.creational.factorymethod.factory.art;

import org.patterns.creational.factorymethod.product.art.ArtPiece;

public abstract class ArtStudio {

    public abstract ArtPiece createArtPiece(String title, String artist, String typeSpecificDetail);

    // Some core business logic that uses the ArtPiece

    public void produceAndShowArt(String title, String artist, String typeSpecificDetail) {
        System.out.println("Studio: Preparing to create a new art piece...");
        ArtPiece artPiece = createArtPiece(title, artist, typeSpecificDetail); // The factory method is called here
        System.out.println("Studio: Art piece \"" + artPiece.getTitle() + "\" created!");
        System.out.println("Studio: " + artPiece.getDescription());
        artPiece.display();
        System.out.println("Studio: Art piece production complete.\n");
    }
}

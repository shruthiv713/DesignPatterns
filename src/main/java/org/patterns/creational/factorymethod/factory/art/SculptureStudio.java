package org.patterns.creational.factorymethod.factory.art;

import org.patterns.creational.factorymethod.product.art.ArtPiece;
import org.patterns.creational.factorymethod.product.art.Painting;
import org.patterns.creational.factorymethod.product.art.Sculpture;

public class SculptureStudio extends ArtStudio {
    @Override
    public ArtPiece createArtPiece(String title, String artist, String material) {
        return new Sculpture(title,artist, material);
    }
}

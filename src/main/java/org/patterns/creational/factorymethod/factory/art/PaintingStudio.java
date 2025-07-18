package org.patterns.creational.factorymethod.factory.art;

import org.patterns.creational.factorymethod.product.art.ArtPiece;
import org.patterns.creational.factorymethod.product.art.Painting;

public class PaintingStudio extends ArtStudio {
    @Override
    public ArtPiece createArtPiece(String title, String artist, String medium) {
        return new Painting(title,artist, medium);
    }
}

package org.patterns.creational.factorymethod.product.art;

// Concrete Product: Sculpture
public class Sculpture implements ArtPiece {
    private String title;
    private String artist;
    private String material;

    public Sculpture(String title, String artist, String material) {
        this.title = title;
        this.artist = artist;
        this.material = material;
        System.out.println("Creating a Sculpture: \"" + title + "\" by " + artist + " (Material: " + material + ")");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return "A unique sculpture by " + artist + " crafted from " + material + ".";
    }

    @Override
    public void display() {
        System.out.println("Displaying Sculpture: \"" + title + "\" by " + artist + " (Material: " + material + ")");
    }
}
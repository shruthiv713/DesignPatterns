package org.patterns.creational.factorymethod.product.art;

public class Painting implements ArtPiece {
    private String title;
    private String artist;
    private String medium;

    public Painting(String title, String artist, String medium) {
        this.title = title;
        this.artist = artist;
        this.medium = medium;
        System.out.println("Creating a Painting: " + title + " by " + artist + " using " + medium + " medium.");

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return "A beautiful painting by " + artist + " using " + medium + " medium.";
    }

    @Override
    public void display() {
        System.out.println("Displaying Painting: \"" + title + "\" by " + artist + " (" + medium + ")");
    }
}
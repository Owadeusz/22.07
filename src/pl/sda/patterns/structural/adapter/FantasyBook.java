package pl.sda.patterns.structural.adapter;

public class FantasyBook implements Book {
    @Override
    public String bio() {
        return "biografia";
    }

    @Override
    public String frontPicture() {
        return "Front of fantasy book";
    }
}

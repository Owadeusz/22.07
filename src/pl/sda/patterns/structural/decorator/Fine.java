package pl.sda.patterns.structural.decorator;

public class Fine implements Viewable{
    private String reson;

    public Fine(String reson) {
        this.reson = reson;
    }

    @Override
    public void show() {
        System.out.println("Popełniłeś Wykroczenie");
        System.out.println(reson);

    }
}

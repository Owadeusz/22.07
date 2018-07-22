package pl.sda.patterns.structural.proxy;

public class Client {
    private final Bascet bascet;

    public Client(Bascet bascet) {
        this.bascet = bascet;
    }

    public void doActions() {
        bascet.addproduct(new Product("szampon"));
        bascet.addproduct(new Product("suszarka"));
        bascet.addproduct(new Product("piwo"));
        bascet.addproduct(new Product("piwo"));
        bascet.removeProduct(new Product("piwo"));
    }
}

package pl.sda.patterns.structural.proxy;

import java.util.List;

public class BascetLoggerProxy implements Bascet{
    private final RealBascet realBascet;

    public BascetLoggerProxy(RealBascet realBascet) {
        this.realBascet = realBascet;
    }

    @Override
    public void addproduct(Product product) {
        realBascet.addproduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Użytkownik usunął produkt " + product);
        realBascet.removeProduct(product);
    }

    @Override
    public List<Product> getProduct() {
        return null;
    }
}

package pl.sda.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealBascet implements Bascet {
    List<Product> products = new ArrayList<>();


    @Override
    public void addproduct(Product product) {
        products.add(product);

    }

    @Override
    public void removeProduct(Product product) {
products.remove(product);
    }

    @Override
    public List<Product> getProduct() {
        return products;
    }
}

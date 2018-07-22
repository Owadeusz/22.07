package pl.sda.patterns.structural.proxy;

import java.util.List;

interface Bascet {
    void addproduct(Product product);
    void removeProduct(Product product);
    List<Product> getProduct();
}

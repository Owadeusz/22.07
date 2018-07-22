package pl.sda.patterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
       RealBascet realBascet = new RealBascet();
        Client client = new Client(new BascetLoggerProxy(realBascet));
        client.doActions();
        realBascet.getProduct().forEach(System.out::println);
        realBascet.getProduct().forEach(product -> System.out.println(product));
    }
}

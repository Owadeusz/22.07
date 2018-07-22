package pl.sda.patterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
       EagerSingleton instance = EagerSingleton.getInstance();
       EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);
    }
}

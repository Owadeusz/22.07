package pl.sda.patterns.creational.factoryMethod;

public class Dog implements Animal{
    @Override
    public void makeASound() {
        System.out.println("Hau Hau!");
    }
}

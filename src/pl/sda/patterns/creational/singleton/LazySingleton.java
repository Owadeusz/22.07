package pl.sda.patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;
    private final String value;

    private LazySingleton() {
        this.value = "Jakaś Wartość*";
    }

    public static LazySingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}

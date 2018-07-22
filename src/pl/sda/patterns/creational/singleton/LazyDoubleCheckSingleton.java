package pl.sda.patterns.creational.singleton;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton INSTANCE;
    private final String value;

    private LazyDoubleCheckSingleton() {
        this.value = "Jakaś Wartość*";
    }

    public static LazyDoubleCheckSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
            INSTANCE = new LazyDoubleCheckSingleton();
        }
        return INSTANCE;
    }
}

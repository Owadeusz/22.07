package pl.sda.patterns.creational.singleton;

public class NoNameSingleton {

    private final String value;

    private static class Singleton {


        public static final NoNameSingleton INSTANCE = new NoNameSingleton();

        private NoNameSingleton() {
            this.value = "Jakaś Wartość";
        }
       private static NoNameSingleton getINSTANCE(){
            return Singleton.INSTANCE;
        }

    }
}

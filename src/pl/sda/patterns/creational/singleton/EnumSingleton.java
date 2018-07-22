package pl.sda.patterns.creational.singleton;

enum EnumSingleton {
    INSTANCE("Jakas Wartość1");
    private final String value;

    EnumSingleton(String value){
        this.value = value;
    }
}

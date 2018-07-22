package pl.sda.patterns.creational.builder;

public interface VehicleBuilder {
    void addWheel();
    void setTank(int size);
    Vehicle build();
}

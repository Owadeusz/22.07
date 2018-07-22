package pl.sda.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {
    private List<Wheel> wheels = new ArrayList<>();
    private int tankSize;

    @Override
    public void addWheel() {
        wheels.add(new Wheel(27));
    }

    @Override
    public void setTank(int size) {
        tankSize = size;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(tankSize, wheels);
    }
}

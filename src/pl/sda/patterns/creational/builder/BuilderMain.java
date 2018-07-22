package pl.sda.patterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        VehicleBuilder builder = new AmericanVehicleBuilder();
        builder.addWheel();
        builder.addWheel();
        builder.addWheel();
        builder.setTank(24);
        Vehicle build = builder.build();
//        Vehicle build1 = builder.addWheel().setTank(50).build();
//
    }
}

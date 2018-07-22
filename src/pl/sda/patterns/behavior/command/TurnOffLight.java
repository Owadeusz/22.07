package pl.sda.patterns.behavior.command;

public class TurnOffLight implements Command{
   private final Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Wyłączam");
    }
}

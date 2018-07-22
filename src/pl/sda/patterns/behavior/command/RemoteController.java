package pl.sda.patterns.behavior.command;

public class RemoteController {
    private Command button1;
    private Command button2;

    public RemoteController(Light light) {
        button1 = new TurnOnLight(light);
        button2 = new TurnOffLight(light);
    }

    public Command clickButton1() {
        return button1;
    }

    public void setButton1(Command button1) {
        this.button1 = button1;
    }

    public Command clickButton2() {
        return button2;
    }

    public void setButton2(Command button2) {
        this.button2 = button2;
    }
}

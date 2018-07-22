package pl.sda.patterns.creational.abstractFactory;

public class WindowsUi implements  UiAbstractFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Input getInput() {
        return new WindowsInput();
    }
}

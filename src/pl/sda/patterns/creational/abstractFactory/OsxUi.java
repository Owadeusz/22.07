package pl.sda.patterns.creational.abstractFactory;

public class OsxUi implements UiAbstractFactory {
    @Override
    public Button getButton() {
        return new OsxButton();
    }

    @Override
    public Input getInput() {
        return new OsxInput();
    }
}

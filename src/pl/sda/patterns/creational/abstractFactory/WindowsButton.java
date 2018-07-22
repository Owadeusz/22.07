package pl.sda.patterns.creational.abstractFactory;

public class WindowsButton implements Button {
    StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void click(String value) {
        stringBuilder.append(value);
    }

    @Override
    public String show() {
        return stringBuilder.toString();
    }
}

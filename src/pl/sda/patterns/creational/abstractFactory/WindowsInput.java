package pl.sda.patterns.creational.abstractFactory;

public class WindowsInput implements Input {
    StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void write(String value) {
        stringBuilder.append(value);
    }

    @Override
    public String getText() {
        return stringBuilder.toString();
    }
}

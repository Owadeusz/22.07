package pl.sda.patterns.creational.abstractFactory;

public class OsxButton implements Button {
    String text;
    @Override
    public void click(String value) {
        text = value;
    }

    @Override
    public String show() {
        return text;
    }
}

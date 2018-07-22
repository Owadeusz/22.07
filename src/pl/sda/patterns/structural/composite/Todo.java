package pl.sda.patterns.structural.composite;

public class Todo implements Viewable{
   private final String value;

    public Todo(String value) {
        this.value = value;
    }

    @Override
    public String getContent() {
        return value;
    }
}

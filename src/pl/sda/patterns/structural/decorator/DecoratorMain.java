package pl.sda.patterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Viewable viewable = new Fine("Piłeś przed zajęciami z programowania");
        viewable = new Admonishment(viewable);
        viewable.show();

    }
}

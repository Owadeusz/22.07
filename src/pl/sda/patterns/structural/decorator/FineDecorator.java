package pl.sda.patterns.structural.decorator;

public class FineDecorator implements Viewable{
    private final Viewable viewable =

    @Override
    public void show() {
        viewable.show();
    }
    protected void showBefore();
}

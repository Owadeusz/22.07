package pl.sda.patterns.structural.bridge;

public class ShortView implements View {
    private final Resource resource;

    public ShortView(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void show() {
        System.out.println(resource.getHeader());
        System.out.println(resource.getImage());
    }
}

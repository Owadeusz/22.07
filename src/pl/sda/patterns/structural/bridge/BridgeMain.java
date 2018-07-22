package pl.sda.patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Resource resource = new AlbumResource("Mirage","album_mirage.jpg","pierwsza piosenka","Armada");

        View view = new ShortView(resource);
        view.show();
    }
}

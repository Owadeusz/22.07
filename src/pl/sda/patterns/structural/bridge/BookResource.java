package pl.sda.patterns.structural.bridge;

public class BookResource implements Resource {
    private String header;
    private String content;
    private String shortDescription;
    private String publisher;

    public BookResource(String header, String content, String shortDescription, String publisher) {
        this.header = header;
        this.content = content;
        this.shortDescription = shortDescription;
        this.publisher = publisher;
    }

    @Override
    public String getHeader() {
        return this.header;
    }

    @Override
    public String getImage() {
        return this.content;
    }

    @Override
    public String getContent() {
        return this.shortDescription;
    }

    @Override
    public String getFooter() {
        return this.publisher;
    }
}

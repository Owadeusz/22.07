package pl.sda.patterns.structural.flyweight;

public class Document {
   private String name;
   private String header;
   private String content;
   private String footer;

    public Document(String name, String header, String content, String footer) {
        this.name = name;
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}

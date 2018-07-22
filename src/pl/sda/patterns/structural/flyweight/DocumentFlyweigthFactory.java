package pl.sda.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DocumentFlyweigthFactory {
    private final DocumentParser parser;
    private final Map<String ,Document> library = new HashMap<>();

    public DocumentFlyweigthFactory(DocumentParser parser) {
        this.parser = parser;
    }

    public DocumentParser getDocument(String fileName, String content) {
        Document document = library.get(fileName);
        if(document == null) {
            document = parser.parseDocument(fileName,content);
            library.put(fileName,document);
        }
     return document;
    }
}

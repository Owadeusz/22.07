package pl.sda.patterns.structural.adapter;

import java.util.stream.Collector;

public class AlbumResource implements ResourceProduct {
    private final Album album;
    AlbumResource(Album album){
        this.album = album
    }

    @Override
    public String getPicture() {
        return album.front();
    }

    @Override
    public String getContent() {
        return album.listofSongs().stream()
                .collect(
                        Collector.joining("")
                );
    }
}

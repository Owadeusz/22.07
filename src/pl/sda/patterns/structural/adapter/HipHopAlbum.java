package pl.sda.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class HipHopAlbum implements Album {
    @Override
    public List<String> listofSongs() {
        return Arrays.asList(
                "piosenka pierwsza",
                "druga piosenka"
        );
    }

    @Override
    public String front() {
        return "Zdjęcie Leroya";
    }
}

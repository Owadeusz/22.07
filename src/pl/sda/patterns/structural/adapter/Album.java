package pl.sda.patterns.structural.adapter;

import java.util.List;

public interface Album {
    List<String > listofSongs();
    String front();
}

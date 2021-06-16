package ru.fiz.java8_test.case1;

import ru.fiz.java8_test.case1.models.Artist;

import java.util.HashSet;
import java.util.Set;

public class ArtistCalculator {

    public static final Set<Artist> artistList = new HashSet<>();

    public ArtistCalculator() {
        artistList.add(new Artist("Art1", "UK", "London", 10000));
        artistList.add(new Artist("Art2", "Germany", "Berlin", 10000));
        artistList.add(new Artist("Art3", "Germany", "Berlin", 14000));
        artistList.add(new Artist("Art4", "Poland", "Krakow", 210000));
        artistList.add(new Artist("Art5", "Ukraine", "Kiev", 550000));
        artistList.add(new Artist("Art6", "Ukraine", "Odessa", 50500));
        artistList.add(new Artist("Art7", "Russian", "Moscow", 90500));
        artistList.add(new Artist("Art8", "Russian", "Tuula", 15000));
        artistList.add(new Artist("Art9", "UK", "London", 155000));
        artistList.add(new Artist("Art10", "UK", "London", 5000));
        artistList.add(new Artist("Art11", "Ukraine", "Kiev", 90000));
    }

    public int count(String city) {
        int count = 0;
        for (Artist artist: artistList) {
            if (artist.getCity().equals(city)) {
                count++;
            }
        }

        return count;
    }
}

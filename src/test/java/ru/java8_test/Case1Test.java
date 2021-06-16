package ru.java8_test;

import org.junit.jupiter.api.Test;
import ru.fiz.java8_test.case1.ArtistCalculator;
import ru.fiz.java8_test.case1.ArtistUtil;
import ru.fiz.java8_test.case1.models.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case1Test {

    @Test
    void calculateArtists() {
        final ArtistCalculator artistCalculator = new ArtistCalculator();

        assertEquals(3, artistCalculator.count("London"));
        assertEquals(0, artistCalculator.count("NotExistCity"));
        assertEquals(0, artistCalculator.count(null));
    }

    @Test
    void uppercaseNames() {
        final List<Artist> artists = new ArrayList<>(){{
            add(new Artist("art1", "", "", 1));
            add(new Artist("art2", "", "", 1));
            add(new Artist("art3", "", "", 1));
        }};

        assertEquals(asList("ART1", "ART2", "ART3"), new ArtistUtil().upperCaseArtistsName(artists));
    }

    @Test
    void maxSalary() {
        assertEquals(550000, new ArtistUtil().maxSalary());
    }

    @Test
    void totalSalary() {
        assertEquals(10, new ArtistUtil().totalSalary());
    }

    @Test
    void randomArtist() {
        final Set<Artist> artists = new ArtistUtil().generateRandomArtists(10);

        assertEquals(10, artists.size());
    }
}

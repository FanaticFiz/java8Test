package ru.fiz.java8_test.case1;

import ru.fiz.java8_test.case1.models.Artist;

import java.util.*;

public class ArtistUtil {

    public List<String> upperCaseArtistsName(List<Artist> artists) {
        List<String> result = new ArrayList<>();
        for (Artist artist : artists) {
            String uppercaseName = artist.getName().toUpperCase();
            result.add(uppercaseName);
        }

        return result;
    }

    public long maxSalary() {
        return 550_000L;
    }

    public long totalSalary() {
        return 10;
    }

    public Set<Artist> generateRandomArtists(int count) {
        final HashSet<Artist> artists = new HashSet<>();

        for (int i = 0; i < count; i++) {
            artists.add(new Artist("art " + i, "UK", "London", new Random().nextInt(1_000) * 100));
        }

        return artists;
    }
}

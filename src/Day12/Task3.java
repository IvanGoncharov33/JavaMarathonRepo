package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        List<MusicBand> musicBandsLate2000 = new ArrayList<>();

        musicBands.add(new MusicBand("Чай вдвоем", 1994));
        musicBands.add(new MusicBand("Rammstein", 1994));
        musicBands.add(new MusicBand("Mr.Credo", 1996));
        musicBands.add(new MusicBand("The offspring", 1984));
        musicBands.add(new MusicBand("Scorpions", 1995));
        musicBands.add(new MusicBand("Die Antwoord", 2008));
        musicBands.add(new MusicBand("Anacondaz", 2009));
        musicBands.add(new MusicBand("Noize MC", 2003));
        musicBands.add(new MusicBand("Twenty one pilots", 2009));
        musicBands.add(new MusicBand("Каспийский груз", 2000));

        Collections.shuffle(musicBands);

        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                musicBandsLate2000.add(band);
            }
        }
        System.out.println(musicBands);
        System.out.println(musicBandsLate2000);
    }
}


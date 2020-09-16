package SeaBattle;

import java.util.Objects;

public class Deck {
   private  Coordinate coordinate;
    private boolean isAliveDeck = true;

    public Deck(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void hit(Coordinate coordinate) {

        if (this.coordinate.equals(coordinate)) {
            isAliveDeck = false;
        }
    }

        public String display () {
            String display;
            if (isAliveDeck) {
                display = Display.DECK_ISALIVE.toString();

            }else display = Display.DECK_ISNOTALIVE.toString();

            return display;
        }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public boolean getIsAliveDeck() {
        return isAliveDeck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(coordinate, deck.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}

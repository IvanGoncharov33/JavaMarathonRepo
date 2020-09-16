package SeaBattle;

import java.util.Arrays;

public class PlayingField {
    String[][] field = new String[10][10];

    public PlayingField() {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], Display.EMPTY_CELL.toString());
        }
    }

    public void drawHit(Coordinate coordinate) {

        field[coordinate.getCoordinateY()][coordinate.getCoordinateX()] = Display.DECK_ISNOTALIVE.toString();
    }

    public void drawMissHit(Coordinate coordinate) {

        field[coordinate.getCoordinateY()][coordinate.getCoordinateX()] = Display.MISS_CELL.toString();
    }

    public void printField() {

        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println("\n");
        }
    }

    public String[][] getField() {

        return field;
    }
}

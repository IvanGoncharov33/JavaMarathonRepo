package SeaBattle;

import java.util.*;

public class Ship {
    private final List<Deck> decks = new ArrayList<>();
    private boolean isAliveShip = true;

    public Ship(Player player, Coordinate... coordinates) {

        for (Coordinate coordinate : coordinates) {
            decks.add(new Deck(coordinate));
        }
        addToPlayingField(player);
    }

    public List<Deck> getDecks() {

        return decks;
    }

    public Deck getLastDeck() {

        Deck deck = null;
        if (!decks.isEmpty()) {
            deck = decks.get(decks.size() - 1);
            return deck;
        }
        try {
            throw new Exception("Пустой лист палуб");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public boolean getIsAlive() {

        return isAliveShip;
    }

    public void checkIsAliveShip() {

        boolean aFloat = false;
        for (Deck deck : decks) {
            if (deck.getIsAliveDeck()) {
                aFloat = true;
            }
        }
        this.isAliveShip = aFloat;
    }


    private void addToPlayingField(Player player) {

        for (Deck deck : decks) {
            player.getPlayingField().getField()[deck.getCoordinate().getCoordinateY()][deck.getCoordinate().getCoordinateX()] = deck.display();
        }
    }

    public static void initSingleDeckShip(Player player) {

        Scanner scanner = new Scanner(System.in);
        Coordinate coordinate = null;
        int coordinateX;
        int coordinateY;
        String[] arrayCoord;
        while (true) {
            System.out.println("Введите координаты однопалубного корабля: (формат: x,y)");
            arrayCoord = scanner.nextLine().split(",");
            if (!Valid.isValidCountCoordinate(2, arrayCoord)) {
                continue;
            }
            coordinateX = Integer.parseInt(arrayCoord[0]);
            coordinateY = Integer.parseInt(arrayCoord[1]);
            coordinate = new Coordinate(coordinateX, coordinateY);
            if (Valid.isValidShip(player, coordinate)) {
                break;
            }
        }
        player.addShipList(new Ship(player, coordinate));
        ShipHalo.drawHallo(player);
    }

    public static void initDoubleDeckShip(Player player) {

        Scanner scanner = new Scanner(System.in);
        Coordinate[] coordinate = new Coordinate[2];
        int coordinateX;
        int coordinateY;
        String[] twoCoord;
        String[] arrayCoord;

        while (true) {
            System.out.println("Введите координаты двухпалубного корабля: (формат: x,y;x,y)");
            twoCoord = scanner.nextLine().split(";");
            if (!Valid.isValidCountCoordinate(2, twoCoord)) {
                continue;
            }
            for (int i = 0; i < 2; i++) {
                arrayCoord = twoCoord[i].split(",");
                coordinateX = Integer.parseInt(arrayCoord[0]);
                coordinateY = Integer.parseInt(arrayCoord[1]);
                coordinate[i] = new Coordinate(coordinateX, coordinateY);
            }
            if (Valid.isValidShip(player, coordinate[0], coordinate[1])) {
                break;
            }
        }
        player.addShipList(new Ship(player, coordinate[0], coordinate[1]));
        ShipHalo.drawHallo(player);
    }

    public static void initThreeDeckShip(Player player) {

        Scanner scanner = new Scanner(System.in);
        Coordinate[] coordinate = new Coordinate[3];
        int coordinateX;
        int coordinateY;
        String[] allCoord;
        String[] arrayCoord;

        while (true) {
            System.out.println("Введите координаты трехпалубного корабля: (формат: x,y;x,y;x,y)");
            allCoord = scanner.nextLine().split(";");
            if (!Valid.isValidCountCoordinate(3, allCoord)) {
                continue;
            }
            for (int i = 0; i < 3; i++) {
                arrayCoord = allCoord[i].split(",");
                coordinateX = Integer.parseInt(arrayCoord[0]);
                coordinateY = Integer.parseInt(arrayCoord[1]);
                coordinate[i] = new Coordinate(coordinateX, coordinateY);
            }
            if (Valid.isValidShip(player, coordinate[0], coordinate[1], coordinate[2])) {
                break;
            }
        }
        player.addShipList(new Ship(player, coordinate[0], coordinate[1], coordinate[2]));
        ShipHalo.drawHallo(player);
    }

    public static void initFourDeckShip(Player player) {

        Scanner scanner = new Scanner(System.in);
        Coordinate[] coordinate = new Coordinate[4];
        int coordinateX;
        int coordinateY;
        String[] allCoord;
        String[] arrayCoord;

        while (true) {
            System.out.println("Введите координаты четырехпалубного корабля: (формат: x,y;x,y;x,y)");
            allCoord = scanner.nextLine().split(";");
            if (!Valid.isValidCountCoordinate(4, allCoord)) {
                continue;
            }
            for (int i = 0; i < 4; i++) {
                arrayCoord = allCoord[i].split(",");
                coordinateX = Integer.parseInt(arrayCoord[0]);
                coordinateY = Integer.parseInt(arrayCoord[1]);
                coordinate[i] = new Coordinate(coordinateX, coordinateY);
            }
            if (Valid.isValidShip(player, coordinate[0], coordinate[1], coordinate[2], coordinate[3])) {
                break;
            }
        }
        player.addShipList(new Ship(player, coordinate[0], coordinate[1], coordinate[2], coordinate[3]));
        ShipHalo.drawHallo(player);
    }
}

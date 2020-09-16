package SeaBattle;

public class ShipHalo {


    public static String display() {

        String display;
        display = Display.HALO.toString();
        return display;
    }

    public static void drawHallo(Player player) {

        if (player.getLastShip().getDecks().size() > 1) {
            if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() + 1 == player.getLastShip().getDecks().get(1).getCoordinate().getCoordinateX()) {
                displayHalloHorizont(player);
            } else {
                displayHalloVertical(player);
            }
        } else {
            displayHalloHorizont(player);
            displayHalloVertical(player);
        }
    }

    private static void displayHalloHorizont(Player player) {

        if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1 >= 0) {
            player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY()]
                    [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1] = ShipHalo.display();

            if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1 >= 0) {
                player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1]
                        [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1] = ShipHalo.display();
            }

            if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() + 1 < 10) {
                player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() + 1]
                        [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1] = ShipHalo.display();
            }
        }

        if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1 < 10) {
            player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY()]
                    [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1] = ShipHalo.display();

            if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1 < 10) {
                player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1]
                        [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1] = ShipHalo.display();
            }

            if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() - 1 >= 0) {
                player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() - 1]
                        [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1] = ShipHalo.display();
            }
        }


        for (Deck deck : player.getLastShip().getDecks()) {
            if (deck.getCoordinate().getCoordinateY() - 1 >= 0) {
                player.getPlayingField().getField()[deck.getCoordinate().getCoordinateY() - 1][deck.getCoordinate().getCoordinateX()] = ShipHalo.display();

            }
            if (deck.getCoordinate().getCoordinateY() + 1 < 10) {
                player.getPlayingField().getField()[deck.getCoordinate().getCoordinateY() + 1][deck.getCoordinate().getCoordinateX()] = ShipHalo.display();
            }
        }
    }

    private static void displayHalloVertical(Player player) {

        if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1 >= 0) {
            player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1]
                    [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX()] = ShipHalo.display();

            if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1 >= 0) {
                player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1]
                        [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() - 1] = ShipHalo.display();
            }
            if (player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() + 1 < 10) {
                player.getPlayingField().getField()[player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateY() - 1]
                        [player.getLastShip().getDecks().get(0).getCoordinate().getCoordinateX() + 1] = ShipHalo.display();
            }
        }

        if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1 < 10) {
            player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1]
                    [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX()] = ShipHalo.display();
            if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1 < 10) {
                player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1]
                        [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() + 1] = ShipHalo.display();
            }
            if (player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() - 1 >= 0) {
                player.getPlayingField().getField()[player.getLastShip().getLastDeck().getCoordinate().getCoordinateY() + 1]
                        [player.getLastShip().getLastDeck().getCoordinate().getCoordinateX() - 1] = ShipHalo.display();
            }
        }
        for (Deck deck : player.getLastShip().getDecks()) {
            if (deck.getCoordinate().getCoordinateX() - 1 >= 0) {
                player.getPlayingField().getField()[deck.getCoordinate().getCoordinateY()][deck.getCoordinate().getCoordinateX() - 1] = ShipHalo.display();
            }
            if (deck.getCoordinate().getCoordinateX() + 1 < 10)
                player.getPlayingField().getField()[deck.getCoordinate().getCoordinateY()][deck.getCoordinate().getCoordinateX() + 1] = ShipHalo.display();
        }
    }
}

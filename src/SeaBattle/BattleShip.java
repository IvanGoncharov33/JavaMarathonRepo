package SeaBattle;

import java.util.Scanner;

public class BattleShip {

    int coordinateX;
    int coordinateY;
    Ship ship;
    String playerMove = "";


    public void greeting(Player player1, Player player2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую игроков в игре Морской бой \n");
        System.out.println("Игрок 1 введи имя:");
        player1.setName(scanner.next());
        System.out.println("Игрок 2 введи имя:");
        player2.setName(scanner.next());
        playerMove = whoFirstMove(player1, player2);
    }

    public void shot(Player playerShooting, Player playerAttacked) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayCoord;

        while (true) {
            System.out.println(playerShooting.getName() + " твой ход! Введите координаты выстрела (формат x,y):");
            arrayCoord = scanner.nextLine().split(",");
            coordinateX = Integer.parseInt(arrayCoord[0]);
            coordinateY = Integer.parseInt(arrayCoord[1]);
            try {
                Valid.isValidCoordinate(coordinateX, coordinateY);
                break;
            } catch (NotValidCoordinateException e) {
                e.printStackTrace();
            }
        }
        Coordinate soughtCoordinate = new Coordinate(coordinateX, coordinateY);
        Deck soughtDeck = new Deck(soughtCoordinate);
        if (checkHit(playerAttacked)) {
            sinking(playerAttacked, soughtDeck);
            hit(playerShooting, playerAttacked, soughtDeck);
        } else {
            miss(playerShooting, playerAttacked, soughtDeck);
        }
    }

    private boolean checkHit(Player playerAttacked) {
        boolean hit = false;
        if (playerAttacked.getPlayingField().getField()[coordinateY][coordinateX].equals(Display.DECK_ISALIVE.toString())) {
            hit = true;
        }
        return hit;
    }

    private void sinking(Player playerAttacked, Deck soughtDeck) {
        for (Ship ship : playerAttacked.getShipList()) {
            for (Deck deck : ship.getDecks()) {
                deck.hit(soughtDeck.getCoordinate());
            }
        }
    }

    private void hit(Player player, Player playerAttacked, Deck soughtDeck) {
        ship = playerAttacked.searchShip(soughtDeck);
        ship.checkIsAliveShip();
        if (ship.getIsAlive()) {
            System.out.println("Ранил!");
            player.getFieldToAttack().drawHit(soughtDeck.getCoordinate());
            player.getFieldToAttack().printField();
        } else {
            System.out.println("Убил!");
            player.getFieldToAttack().drawHit(soughtDeck.getCoordinate());
            player.getFieldToAttack().printField();
        }
        playerMove = player.getName();
    }

    private void miss(Player playerShooting, Player playerAttacked, Deck soughtDeck) {
        System.out.println("Мимо!");
        playerShooting.getFieldToAttack().drawMissHit(soughtDeck.getCoordinate());
        playerMove = playerAttacked.getName();
    }

    public void placementShip(Player player) {
        System.out.println("Начнем расстановку кораблей для " + player.getName());
        Ship.initSingleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initSingleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initSingleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initSingleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initDoubleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initDoubleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initDoubleDeckShip(player);
        player.getPlayingField().printField();
        Ship.initThreeDeckShip(player);
        player.getPlayingField().printField();
        Ship.initThreeDeckShip(player);
        player.getPlayingField().printField();
        Ship.initFourDeckShip(player);
        player.getPlayingField().printField();
    }

    private String whoFirstMove(Player player, Player player1) {
        if ((int) (Math.random() * 2) == 1) {
            return player.getName();
        }
        return player1.getName();
    }
}



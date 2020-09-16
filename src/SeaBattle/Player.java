package SeaBattle;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private final List<Ship> playerShip = new ArrayList<>();
    private final PlayingField playingField;
    private final PlayingField fieldToAttack;

    public Player() {

        this.playingField = new PlayingField();
        this.fieldToAttack = new PlayingField();
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Ship searchShip(Deck soughtDeck) {

        for (Ship ship : playerShip) {
            for (Deck deck : ship.getDecks()) {
                if (soughtDeck.equals(deck)) {
                    return ship;
                }
            }
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Корабль не найден!");
        }
        return null;
    }


    public void addShipList(Ship ship) {

        playerShip.add(ship);
    }

    public List<Ship> getShipList() {

        return playerShip;
    }

    public PlayingField getPlayingField() {

        return playingField;
    }

    public PlayingField getFieldToAttack() {

        return fieldToAttack;
    }

    public Ship getLastShip() {

        Ship ship = null;
        if (!playerShip.isEmpty()) {
            ship = playerShip.get(playerShip.size() - 1);
            return ship;
        }
        try {
            throw new Exception("Пустой лист");
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public boolean gameOver() {

        boolean hasShips = false;
        for (Ship ship : playerShip) {
            ship.checkIsAliveShip();
            if (ship.getIsAlive()) {
                hasShips = true;

            }
        }
        System.out.println(this.getName() + "проиграл!");
        return hasShips;
    }


}



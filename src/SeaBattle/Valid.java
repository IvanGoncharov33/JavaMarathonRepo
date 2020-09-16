package SeaBattle;

public class Valid {

    public static boolean isValidShip(Player player, Coordinate... coordinates) {

        boolean isValid = false;
        try {
            for (Coordinate coordinate : coordinates) {
                isValidCoordinate(coordinate.getCoordinateX(), coordinate.getCoordinateY());
            }
            isValidDeck(coordinates);
            isValidPlacement(player, coordinates);
            isValid = true;
        } catch (NotValidCoordinateException e) {
            System.out.println("Вы ввели неверные координаты!");
        } catch (NotValidDeckException e) {
            System.out.println("Корабль не может быть разделен!");
        } catch (NotValidPlacement e) {
            System.out.println("Корабль нельзя поставить на выбранное место.Выберите другое место");
        }
        return isValid;
    }


    public static void isValidCoordinate(int coordinateX, int coordinateY) throws NotValidCoordinateException {

        if (!(coordinateX >= 0 && coordinateX < 10 && coordinateY >= 0 && coordinateY < 10)) {
            throw new NotValidCoordinateException();
        }
    }

    private static void isValidDeck(Coordinate... coordinates) throws NotValidDeckException {

        if (coordinates.length > 1) {
            for (int i = 0; i < coordinates.length - 1; i++) {
                if (!(coordinates[i].getCoordinateX() + 1 == coordinates[i + 1].getCoordinateX() ||
                        coordinates[i].getCoordinateY() + 1 == coordinates[i + 1].getCoordinateY())) {
                    throw new NotValidDeckException();
                }
            }
        }
    }

    private static void isValidPlacement(Player player, Coordinate... coordinates) throws NotValidPlacement {

        for (Coordinate coordinate : coordinates) {
            if (!(player.getPlayingField().getField()[coordinate.getCoordinateY()][coordinate.getCoordinateX()].equals(Display.EMPTY_CELL.toString()))) {
                throw new NotValidPlacement();
            }
        }
    }

    public static boolean isValidCountCoordinate(int countCoordinate, String[] coord) {
        try {
            if (coord.length != countCoordinate) {
                throw new NotValidCountCoordinates();
            }
        } catch (NotValidCountCoordinates e) {
            System.out.println("Вы ввели неверное кол-во координат!");
            return false;
        }
        return true;
    }
}

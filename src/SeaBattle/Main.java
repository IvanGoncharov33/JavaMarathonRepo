package SeaBattle;

public class Main {
    public static void main(String[] args) {

     BattleShip battleShip = new BattleShip();
        Player player1 = new Player();
        Player player2 = new Player();

        battleShip.greeting(player1, player2);
         battleShip.placementShip(player1);
         battleShip.placementShip(player2);

        System.out.println("Расстановка закончена.Приступим к игре");
        while (player1.gameOver() && player2.gameOver()) {
            if (battleShip.playerMove.equals(player1.getName())) {
                  battleShip.shot(player1,player2);
            }else {
               battleShip.shot(player2,player1);
            }
        }
    }
}




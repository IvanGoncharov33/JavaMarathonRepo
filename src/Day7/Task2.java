package Day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();


        while (true) {
            if (player1.getStamina() == 0) {
                player1.run();
                break;
            } else {
                player1.run();
            }
        }

        System.out.println(Player.getCountPlayers());
    }


}

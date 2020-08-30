package Day7;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(){
        this.stamina =(int)(Math.random() * 11)+90;

        if (countPlayers < 6){
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){

        if(stamina > MIN_STAMINA){
            stamina -= 1;
        }else {
            if (stamina == MIN_STAMINA)
                countPlayers -= 1;
        }
    }

    public void info(){
        int freePlaces = 6 - countPlayers;
        String info = "";

        switch (freePlaces){
            case 5:
                info = "свободных мест";
                break;
            case 4:
            case 3:
            case 2:
                info = "свободных места";
                break;
            case 1:
                info = "свободное место";
                break;
        }

        if (countPlayers < 6){
            System.out.printf("Команды неполные, еще есть %d %s",freePlaces, info);
        }else {
            System.out.println("Мест в командах больше нет");
        }

    }
}

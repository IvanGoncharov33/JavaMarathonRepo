package Day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Creed");
        User user2 = new User("Anactas");
        User user3 = new User("Shaolin");

        user1.sendMessage(user2, "Привет!Как дела?") ;
        user2.sendMessage(user1, "Привет, все гуд.");
        user1.sendMessage(user2, "Как там наши поживают?");
        user2.sendMessage(user1, "Нормально,Светка родила недавно!");
        user2.sendMessage(user1, "Колька, бэху купил");

        user3.sendMessage(user1, "Привет!Давно не виделись!");
        user1.sendMessage(user3, "Привет, и вправду. Давай может сходим в бар сегодня?");
        user3.sendMessage(user1, "Сегодня не могу, давай на следующей неделе.У меня тут такое дело, не выручишь?");
        user1.sendMessage(user3, "Ну давай на следующей, какое дело?");
        user3.sendMessage(user1, "Одолжи 5000 тысяч до понедельника?");
        user3.sendMessage(user1, "Очень нужно!");
        user1.sendMessage(user3, "Есть одна проблемка, ты идешь рядом со мной и не просишь никаких денег.Хах!");

        MessageDataBase.showDialog(user1, user3);
    }
}

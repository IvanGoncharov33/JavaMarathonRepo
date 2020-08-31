package Day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        String string = "";
        Date startDate = new Date();

        for (int i = 0; i < 20000; i++) {
            string += i + " ";
        }
        System.out.println(string);
        Date finishDate = new Date();

        System.out.println(finishDate.getTime() - startDate.getTime() + " ms");

        StringBuilder strBuilder = new StringBuilder();
        Date startDate1 = new Date();

        for (int i = 0; i < 20000; i++) {
            strBuilder.append(i).append(" ");
        }

        System.out.println(strBuilder);
        Date finishDate1 = new Date();
        System.out.println(finishDate1.getTime() - startDate1.getTime()+ " ms");
    }
}

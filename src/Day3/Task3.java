package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dividend;
        double divider;
        int counter = 0;

        while (counter < 5) {
            counter++;
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divider);

        }
    }
}
        /**
         * Я так понимаю, нужно решать темами которые в начале задания,
         * поэтому данное решение оставлю закоментированным
         */

        /*for (int i = 0; i < 5; i++) {

            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();

           String toOutput = (divider == 0 ) ? "Деление на 0" : dividend / divider + "";
            System.out.println(toOutput);
        }*/


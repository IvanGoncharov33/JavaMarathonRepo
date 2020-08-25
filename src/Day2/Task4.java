package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = 0.0;

        if (x >= 5) {
            y = (Math.pow(x, 2.0) - 10) / (x + 7);
        } else {
            if (x > -3 && x < 5) {
                y = (x + 3) * (Math.pow(x, 2.0) - 2);
            } else {
                y = 420;
            }
        }
    }
}

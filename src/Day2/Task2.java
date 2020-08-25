package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++)
        {
            if (i % 5 == 0 && i % 10 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

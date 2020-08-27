package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arraysNumbers = new int[n];
        int countNumbersMoreEight = 0;
        int countNumbersEqualsOne = 0;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int arraysSum = 0;

        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = (int) (Math.random() * 11);
        }


        for (Integer number : arraysNumbers) {
            if (number > 8) {
                countNumbersMoreEight++;
            }
            if (number == 1) {
                countNumbersEqualsOne++;
            }
            if (number % 2 == 0) {
                countEvenNumbers++;
            } else countOddNumbers++;
            arraysSum += number;
        }

        System.out.println(Arrays.toString(arraysNumbers) +
                "\nДлинна масива: " + arraysNumbers.length +
                "\nКоличество чисел больше 8: " + countNumbersMoreEight +
                "\nКоличество чисел равных 1: " + countNumbersEqualsOne +
                "\nКоличество четных чисел: " + countEvenNumbers +
                "\nКоличество нечетных чисел: " + countOddNumbers +
                "\nСумма всех элементов массива: " + arraysSum);
    }
}

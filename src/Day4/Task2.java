package Day4;

public class Task2 {
    public static void main(String[] args) {

        int[] arrays =new int[100];
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int countNumbersEndsWithZero = 0;
        int sumNumbersEndsWithZero = 0;

        for (int i = 0; i <arrays.length ; i++) {
            arrays[i] = (int)(Math.random() *10000);
        }

        for (Integer number:arrays) {
            if (number > maxNumber)
                maxNumber = number;

            if (number < minNumber)
                minNumber = number;

            if (number % 10 == 0 ){
                countNumbersEndsWithZero++;
                sumNumbersEndsWithZero += number;
            }
        }
        System.out.println("Наибольший элемент массива:" + maxNumber +
                "\nНаименьший элемент массива: " + minNumber +
                "\nКоличество элементов массива, оканчивающихся на 0: " + countNumbersEndsWithZero +
                "\nCумма элементов массива, оканчивающихся на 0: " + sumNumbersEndsWithZero);
    }
}

package Day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int maxSumOfThreeNumbers = Integer.MIN_VALUE;
        int indexFirstElement = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] =(int)(Math.random()*10000);
        }

        for (int i = 0; i < array.length-2; i++) {

            int sumOfThreeNumbers = 0;

            for (int j = 0; j < 3; j++) {
                sumOfThreeNumbers += array[i+j];
            }

            if (sumOfThreeNumbers > maxSumOfThreeNumbers){
                maxSumOfThreeNumbers = sumOfThreeNumbers;
                indexFirstElement = i;
            }
        }

        System.out.println("Максимальная сумма из всех троек: " + maxSumOfThreeNumbers +
                "\nИндекс первого элемента тройки: " + indexFirstElement);
    }
}

package Day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] twoDimensionalArrays = new int[12][8];
        int[] sumLinesArray = new int[12];

        for (int i = 0; i < twoDimensionalArrays.length; i++) {
            for (int j = 0; j < twoDimensionalArrays[i].length; j++) {
                twoDimensionalArrays[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < twoDimensionalArrays.length; i++) {

            int sumLines = 0;

            for (Integer numbers : twoDimensionalArrays[i]) {
                sumLines += numbers;
            }
            sumLinesArray[i] = sumLines;
        }

        int maxSum = Integer.MIN_VALUE;

        for (Integer sum : sumLinesArray) {
            if (sum > maxSum)
                maxSum = sum;
        }

        int indexLines = 0;
        for (int i = 0; i < sumLinesArray.length; i++) {
            if (sumLinesArray[i] == maxSum)
                indexLines = i;
        }
        System.out.println(indexLines);
    }
}



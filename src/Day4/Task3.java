package Day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] twoDimensionalArrays = new int[12][8];
        int maxSum = Integer.MIN_VALUE;
        int indexLines = 0;

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
            if (sumLines >= maxSum){
                maxSum = sumLines;
                indexLines = i;
            }
        }
        System.out.println(indexLines);
    }
}



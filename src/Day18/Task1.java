package Day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(sumForArray(numbers,0));

    }
    public static int sumForArray(int[] numbers, int i) {

        if (i == numbers.length) {
            return 0;
        }
        return numbers[i] + sumForArray(numbers,i + 1);
    }


}

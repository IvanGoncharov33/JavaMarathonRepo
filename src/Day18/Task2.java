package Day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(quantitySeven(732757877));
    }

    public static int quantitySeven(int number) {
        if (number == 0) {
            return 0;
        }

        if (number % 10 == 7) {
            return 1 + quantitySeven(number / 10);
        }return quantitySeven(number / 10);
    }
}

package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("Task1.txt");
        double sumNumber = 0;
        int countNumber = 0;
        double averageNumber = 0;

        try (Scanner scanner = new Scanner(file) ){

            while (scanner.hasNext()) {
                sumNumber += Double.parseDouble(scanner.next());
                countNumber++;
            }
           averageNumber = sumNumber / countNumber ;
            System.out.printf(averageNumber + " ----> %.3f", averageNumber);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

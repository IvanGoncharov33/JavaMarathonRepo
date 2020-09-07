package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Task1");
        Scanner scanner = null;
        int count = 0;
        int sumNumber = 0;

        try {
             scanner = new Scanner(file);
            while (scanner.hasNext()) {
                sumNumber += scanner.nextInt();
                count++;
            }

            if (count != 10) {
                throw new IllegalArgumentException();
            }
            System.out.println(sumNumber);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл!");
        }finally {
            assert scanner != null;
            scanner.close();
        }
    }
}


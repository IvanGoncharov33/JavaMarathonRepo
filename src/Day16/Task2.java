package Day16;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        double sumNumber = 0;
        int count = 0;

        try (Writer fileWriter = new FileWriter(file1)) {
            for (int i = 0; i <= 1000; i++) {
                fileWriter.write("" + (int)(Math.random() * 100) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(file1);
             Writer fileWriter2 = new FileWriter(file2)) {

            for (int i = 0; i < 1000; i += 20) {
                double avgNumber = 0;
                for (int j = 0; j < 20; j++) {
                    avgNumber += scanner.nextInt();
                }
                avgNumber = avgNumber / 20;
                fileWriter2.write(avgNumber + " ");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Запись не произошла!");
        }

        try (Scanner scanner1 = new Scanner(file2)){
            while (scanner1.hasNext()) {
                sumNumber += Double.parseDouble(scanner1.next());
                count++;
            }
            System.out.println((int)sumNumber / count);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}

package Day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String[] infoOfProduct;
        List<String[]> productList = new ArrayList<>();

        File fileInput = new File("shoes.csv");
        File fileWrite = new File("NotInStock.txt");

        try (Scanner scanner = new Scanner(fileInput);
             Writer fileWriter = new FileWriter(fileWrite)) {
            while (scanner.hasNext()) {
                infoOfProduct = scanner.nextLine().split(";");
                if (Integer.parseInt(infoOfProduct[2]) == 0) {
                    productList.add(infoOfProduct);
                }
            }

            for (String[] product : productList) {
                fileWriter.write(product[0] + ", ");
                fileWriter.write(product[1] + ", ");
                fileWriter.write(product[2] + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Файл не записан");
        }
    }
}

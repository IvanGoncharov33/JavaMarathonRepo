package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<People> parseFileToStringList() {

        List<People> peopleList = new ArrayList<>();
        File file = new File("people");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String name = "";
                int age = 0;
                name = scanner.next();
                if ((age = scanner.nextInt()) < 0) {
                    throw new IllegalArgumentException();
                }peopleList.add(new People(name,age));
            }
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл!");
        } finally {
            assert scanner != null;
            scanner.close();
        }
        return null;
    }
}

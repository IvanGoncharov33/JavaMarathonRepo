package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(new Car("Tesla"),new Car("Volvo"),new Car ("Toyota"),
                new Car ("Lada"),new Car("Ferrari"));

        System.out.println(carList);

        carList.add(3, new Car("Saab"));
        carList.remove(0);

        System.out.println(carList);
    }
}

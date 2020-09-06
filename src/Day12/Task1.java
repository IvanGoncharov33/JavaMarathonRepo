package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Tesla"));
        carList.add(new Car("Volvo"));
        carList.add(new Car("Lada"));
        carList.add(new Car("Ferrari"));

        System.out.println(carList);

        carList.add(3, new Car("Saab"));
        carList.remove(0);

        System.out.println(carList);
    }
}

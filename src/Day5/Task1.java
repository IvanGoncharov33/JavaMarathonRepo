package Day5;

import java.awt.*;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Черный");
        car.setModel("Tesla Y");
        car.setYearOfIssue(2015);

        System.out.printf("Машина: %s, цвет %s, %d года выпуска.",car.getModel(),car.getColor(),car.getYearOfIssue());
    }
}

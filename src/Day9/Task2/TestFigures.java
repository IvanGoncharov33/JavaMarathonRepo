package Day9.Task2;

public class TestFigures {

    public static double calculateRedPerimeter(Figure[] figures) {
        double redPerimeter = 0.0;
        for (Figure figurAll:figures) {
            if (figurAll.getColor().equals("Red")) {
                redPerimeter += figurAll.perimeter();
            }
        }
        return redPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double redArea = 0.0;
        for (Figure figurAll:figures) {
            if (figurAll.getColor().equals("Red")) {
                redArea += figurAll.area();
            }
        }
        return redArea;
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println("Сумма площадей всех красных фигур: " + calculateRedArea(figures) + "\nСумма периметров всех красных фигур: " + calculateRedPerimeter(figures));
    }
}

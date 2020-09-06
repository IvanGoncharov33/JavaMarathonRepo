package Day9.Task2;

public class Triangle extends Figure {
    private int lengthSide1;
    private int lengthSide2;
    private int base;

    public Triangle(int lengthSide1, int lengthSide2, int base, String color) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.base = base;
    }

    @Override
    public double area() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - lengthSide1) * (p - lengthSide2) * (p - base));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + base;
    }
}
package task_2;
import task_2.Figure;

public class Triangle extends Figure {
    private final double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double d = (a + b + c) / 2;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }


    @Override
    public double perimeter() {
        return a + b + c;
    }
}

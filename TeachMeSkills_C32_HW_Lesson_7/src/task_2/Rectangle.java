package task_2;
import task_2.Figure;

public class Rectangle extends Figure {
    private final double height, width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
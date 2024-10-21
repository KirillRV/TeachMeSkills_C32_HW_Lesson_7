package task_2;
import task_2.Figure;
import task_2.Triangle;
import task_2.Circle;
import task_2.Rectangle;
/**
 * 2. Write a hierarchy of classes Shape, Triangle, Rectangle, Circle.
 * Implement a function to calculate the area for each type of shape and calculate the perimeter (using an abstract class/methods).
 * Create an array of 5 different shapes.
 * Loop through the array and display information about each shape.
 * Display the sum of the perimeters of all shapes in the array.
 */
public class FigureRunner {
        public static void main(String[] args) {

            Figure[] figures = new Figure[5];
            figures[0] = new Triangle(10, 10, 15);
            figures[1] = new Circle(5);
            figures[2] = new Rectangle(8, 6);
            figures[3] = new Triangle(11, 4, 11);
            figures[4] = new Rectangle(3, 25);

            double AreaSum = 0;
            double PerimeterSum = 0;
            for (Figure figure : figures) {
                System.out.println(figure.getClass().getSimpleName());
                figure.print();
                System.out.println();
                AreaSum += figure.area();
                PerimeterSum += figure.perimeter();
            }
            System.out.println("AreaSum: " + AreaSum);
            System.out.println("PerimeterSum: " + PerimeterSum);
        }
}


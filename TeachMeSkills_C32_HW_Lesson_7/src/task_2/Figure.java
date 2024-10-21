package task_2;

public abstract class Figure {
        public abstract double area();
        public abstract double perimeter();

        public void print() {
            System.out.println("Area: " + area());
            System.out.println("Perimeter: " + perimeter());
        }
}

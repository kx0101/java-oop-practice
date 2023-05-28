public class Circle {
    private static double pi = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        double piValue = Circle.getPi();
        System.out.println("The value of pi is: " + piValue);

        double area1 = circle1.calculateArea();
        double area2 = circle2.calculateArea();

        System.out.println("Area of circle1: " + area1);
        System.out.println("Area of circle2: " + area2);
    }
}


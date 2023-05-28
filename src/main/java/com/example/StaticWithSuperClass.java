public class Shape {
    protected static int count = 0;

    public Shape() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void printArea() {
        System.out.println("This is the area of a shape.");
    }
}

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printArea() {
        System.out.println("Area of the rectangle: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(7.5, 2.5);

        int shapeCount = Shape.getCount();
        System.out.println("Number of shapes: " + shapeCount);

        rectangle1.printArea();
        rectangle2.printArea();
    }
}

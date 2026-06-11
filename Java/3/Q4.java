abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Q4 {
    public static void main(String[] args) {

        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 10, 4);

        System.out.println("Circle Area = " +
                c.calculateArea());
        c.draw();

        System.out.println("Rectangle Area = " +
                r.calculateArea());
        r.draw();
    }
}
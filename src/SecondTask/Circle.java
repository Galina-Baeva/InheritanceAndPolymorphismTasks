package SecondTask;

public class Circle extends Shape {
    final double pi = 3.14;
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}

package FirstTask;

public class Circle {
    double radius;
    Colour colour;

    final double pi = 3.14;

    public Circle() {
        radius = 1.0;
        colour = Colour.GREEN;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public void toStringg() {
        System.out.println("This is a " + colour + " circle with a radius of " + radius + " sm.");
    }
}

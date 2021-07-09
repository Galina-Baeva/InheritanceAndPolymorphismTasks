package FirstTask;

public class Circle {
    protected double radius;
    protected Colour colour;

    protected final double pi = 3.14;

     Circle() {
        radius = 1.0;
        colour = Colour.GREEN;
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private Colour getColour() {
        return colour;
    }

    private void setColour(Colour colour) {
        this.colour = colour;
    }

    protected double getArea() {
        return pi * radius * radius;
    }

    protected void toStringg() {
        System.out.println("This is a " + colour + " circle with a radius of " + radius + " sm.");
    }
}

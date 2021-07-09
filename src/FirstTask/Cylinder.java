package FirstTask;

public class Cylinder extends Circle {
    double height;

    protected Cylinder() {
        super();
        height = 1;
    }

    protected Cylinder(double radius) {
        super(radius);
    }

    protected Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    protected Cylinder(double radius, double height, Colour colour) {
        super(radius, colour);
        this.height = height;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    protected double getArea() {
        return 2 * pi * radius * (height + radius);
    }

    protected double getVolume() {
        return height * super.getArea();
    }

    protected void toStringg() {
        System.out.println("This is a " + colour + " cylinder with a radius of " + radius + " sm. and a height of " + height + " sm.");
    }

}

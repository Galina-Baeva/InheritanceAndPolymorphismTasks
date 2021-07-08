package FirstTask;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
        super();
        height = 1;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, Colour colour) {
        super(radius, colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * pi * radius * (height + radius);
    }

    public double getVolume() {
        return height * super.getArea();
    }

    public void toStringg() {
        System.out.println("This is a " + colour + " cylinder with a radius of " + radius + " sm. and a height of " + height + " sm.");
    }

}

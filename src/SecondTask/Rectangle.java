package SecondTask;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }
    @Override
    public String toString() {
        return "A Rectangle with width  " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }
}

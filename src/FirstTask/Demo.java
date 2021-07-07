package FirstTask;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(3, Colour.RED);
        circle.toString();
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(4, 2, Colour.PINK);
        cylinder.toString();
        System.out.println("Volume: " + cylinder.getVolume());
    }
}

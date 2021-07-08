package FirstTask;

public class Demo {
    public static void main(String[] args) {
        FirstTask.Circle circle = new Circle(3, Colour.RED);
        circle.toStringg();
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(4, 2, Colour.PINK);
        cylinder.toStringg();
        System.out.println("Volume: " + cylinder.getVolume());
        Cylinder cylinderDef = new Cylinder();
        cylinderDef.toStringg();
        System.out.println("Volume: " + cylinderDef.getVolume());
    }
}

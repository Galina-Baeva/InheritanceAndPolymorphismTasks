package SecondTask;

public class DemoShape {
    public static void main(String[] args) {
        Shape[] setOfShapes = {new Circle(3, "red", true),
                new Rectangle(3, 4, "Blue", false),
                new Square(2)};
        for (Shape setOfShape : setOfShapes) {
            System.out.println(setOfShape.toString());
            if (setOfShape instanceof Circle) {
                System.out.println(" Area = " + ((Circle) setOfShape).getArea());
            } else {
                System.out.println("Perimeter = " + ((Rectangle) setOfShape).getPerimeter());
            }
        }

    }
}

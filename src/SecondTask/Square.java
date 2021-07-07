package SecondTask;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    @Override
    public String toString() {
        return "A Square with side = " + width + " which is a subclass of " + super.toString();
    }

}

package _07_abstract_class_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double side) {
        this.size = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.size = side;
    }

    @Override
    public void howToColor() {
        System.out.println( "Color all four sides.");
    }

    @Override
    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "Square " +
                "side=" + size + ". " + super.toString();
    }
}